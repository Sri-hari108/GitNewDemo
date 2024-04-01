import org.testng.Assert;
import org.testng.annotations.Test;

import files.Payload;
import io.restassured.path.json.JsonPath;

public class SumValidation {

	@Test
	public void sumOfCourse() {
		
       JsonPath js=new JsonPath(Payload.CoursePrice());
		
		// 1. Print No of courses returned by API
		
		int NoOfCourses=js.getInt("courses.size()");
		System.out.println(NoOfCourses);
		
		//2.Print Purchase Amount
		
		int TotalAmount=js.getInt("dashboard.purchaseAmount");
		System.out.println(TotalAmount);
		
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
