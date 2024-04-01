import org.testng.Assert;

import files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * {

"dashboard": {

"purchaseAmount": 910,

"website": "rahulshettyacademy.com"

},

"courses": [

{

"title": "Selenium Python",

"price": 50,

"copies": 6

},

{

"title": "Cypress",

"price": 40,

"copies": 4

},

{

"title": "RPA",

"price": 45,

"copies": 10

}

]

}



1. Print No of courses returned by API

2.Print Purchase Amount

3. Print Title of the first course

4. Print All course titles and their respective Prices

5. Print no of copies sold by RPA Course

6. Verify if Sum of all Course prices matches with Purchase Amount
		 */

		
		JsonPath js=new JsonPath(Payload.CoursePrice());
		
		// 1. Print No of courses returned by API
		
		int NoOfCourses=js.getInt("courses.size()");
		System.out.println(NoOfCourses);
		
		//2.Print Purchase Amount
		
		int TotalAmount=js.getInt("dashboard.purchaseAmount");
		System.out.println(TotalAmount);
		
		//3. Print Title of the first course
		
		String FirstCourseName=js.getString("courses[0].title");
		System.out.println(FirstCourseName);
		
		//4. Print All course titles and their respective Prices
		
		for(int i=0;i<NoOfCourses;i++) {
			
			String allCoursesName=js.get("courses["+i+"].title");
			System.out.println(allCoursesName);
			
			int respectivePrice=js.getInt("courses["+i+"].price");
			System.out.println(respectivePrice);
				
		}
		
		// 5. Print no of copies sold by RPA Course
		for(int i=0;i<NoOfCourses;i++) {
			String allCoursesName=js.get("courses["+i+"].title");
			if(allCoursesName.equals("RPA")) {
				int NoOfCopiesSold=js.getInt("courses["+i+"].copies");
				System.out.print("no of copies sold by RPA Course : ");
				System.out.println(NoOfCopiesSold);
				break;
			}
		}
		
		// 6. Verify if Sum of all Course prices matches with Purchase Amount
		int sum=0;
          for(int i=0;i<NoOfCourses;i++) {
        	  	
			int respectivePrice=js.getInt("courses["+i+"].price");
			int NoOfCopiesSold=js.getInt("courses["+i+"].copies");
			sum=sum+respectivePrice*NoOfCopiesSold;		
		}
          System.out.println(sum);
          Assert.assertEquals(sum, TotalAmount);
		
		
		
		
	}

}
