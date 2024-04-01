import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.Assert;
public class JiraAPITesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="http://localhost:8080/";
		SessionFilter session=new SessionFilter();
		given().relaxedHTTPSValidation().header("Content-Type","application/json")
		.body("{ \"username\": \"Krishna\", \"password\": \"Jira@108\" }").filter(session)
		.when().post("rest/auth/1/session")
		.then().log().all().assertThat().statusCode(200); 
		
		
		// Add Comment
		String  expectedComments="Attachments Attached ,Please refer";
		String Response1=given().pathParam("key", "10100").header("Content-Type","application/json")
		.body("{\r\n"
				+ "    \"body\": \""+expectedComments+"\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}").filter(session)
		.when().post("rest/api/2/issue/{key}/comment")
		.then().log().all().assertThat().statusCode(201).extract().response().asString();
		JsonPath js=new JsonPath(Response1);
		String commentedID=js.getString("id");
		
		// Add Attachment
		given().header("X-Atlassian-Token", "no-check").filter(session).pathParam("Key", "10100")
		.header("Content-Type","multipart/form-data")
		.multiPart("file", new File("file"))
		.when().post("rest/api/2/issue/{Key}/attachments")
		.then().log().all().assertThat().statusCode(200);
		
		// Get Issues
		
		String Response=given().filter(session).pathParam("Key", "10100")
		.queryParam("fields", "comment")		
		.when().get("rest/api/2/issue/{Key}")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		System.out.println(Response);
		
		JsonPath js1=new JsonPath(Response);
		int commentCounts=js1.getInt("fields.comment.comments.size()");
		
		for(int i=0;i<commentCounts;i++) {
			
			String commID=js1.get("fields.comment.comments["+i+"].id").toString();
			System.out.println(commID);
			
			if(commentedID.equalsIgnoreCase(commID)) {
				String Actualcomments=js1.get("fields.comment.comments["+i+"].body").toString();
				System.out.println(Actualcomments);	
				
				Assert.assertEquals(Actualcomments, expectedComments);
			}
		}

	}

}
