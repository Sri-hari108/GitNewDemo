import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.Payload;
import files.ReusablMethod;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;

public class DynamicJson {

	@Test(dataProvider="BookData")
	public void Book(String isbn,String aisle) {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String addBook=  given().header("Content-Type","application/json").
		body(Payload.AddBook(isbn,aisle)).
		when().post("/Library/Addbook.php").
		then().log().all().assertThat().statusCode(200)
		.header("Server","Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		JsonPath js=ReusablMethod.rawToJson(addBook);
		String id=js.get("ID");
		System.out.println(id);
		
		// DElete Book
		given().header("Content-Type","application/json").
		body("{\r\n"
				+ " \r\n"
				+ "\"ID\" : \""+id+"\"\r\n"
				+ " \r\n"
				+ "} ").
		when().delete("/Library/DeleteBook.php").
		then().log().all().assertThat().statusCode(200).body("msg", equalTo("book is successfully deleted"));
		
	}
		@DataProvider(name="BookData")
		public Object[][] getData() {
			 return new Object[][]  {{"KrishnaBook","0009"},{"Gita","1000"},{"Ramayan","0001"}};
		
	}
}
