package Test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Ps {
	
	public void parent() {
		System.out.println("Hare Krishna");
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("I am Before");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("I am after");
	}



}