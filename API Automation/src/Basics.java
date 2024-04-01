import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import files.ReusablMethod;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Basics {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         /*
          * Given : all input details
          * When  : submit the API- Resource, http method
          * Then : Validate the response 
          */
		
		// Validate if Add API is working as expected
		/*
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.AddPlace()).when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("Server","Apache/2.4.52 (Ubuntu)").extract().response().asString();
		*/
		
		// Content of file to String--> content of file converted to byte--> Byte to String
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\91930\\Desktop\\Fontend\\API TESTING\\AddPlace.Json")))).when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("Server","Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		System.out.println(response);
		JsonPath js=new JsonPath(response);
		String placeId=js.getString("place_id");
		
		System.out.println(placeId);
		
		String newAddress="Vrindavan, INDIA";
		// Update place 
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeId+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "").when().put("/maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		// GET Place
		
		String response1=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.param("place_id", placeId).when().get("/maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200).body("address", equalTo("Vrindavan, INDIA")).extract().response().asString();
		
		System.out.println(response1);
		
		JsonPath js1=ReusablMethod.rawToJson(response1);
		String actyualAddress=js1.getString("address");
		System.out.println(actyualAddress);
	   Assert.assertEquals(actyualAddress, newAddress);
	}

}
