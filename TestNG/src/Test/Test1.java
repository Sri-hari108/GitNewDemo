package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void Hi() {
	System.out.println("Hare Krishna Hare Krishna Krishna Krishna Hare Hare Hare Rama Hare Rama Rama Rama Hare Hare");
	}
	@BeforeTest
	public void b() {
		System.out.println("Jai Panch Tattava");
	}

	@Test
	public void Demo() {
		System.out.println("Hare Krishna");
	}
    @BeforeMethod
    public void method() {
    	System.out.println("I am fool");
    }
    @AfterMethod
    public void me() {
    	System.out.println("I am soul");
    }
	@Test(groups={"Smoke"})
	public void Demo2() {
		System.out.println("16 rounds");
	}

	@AfterTest
	public void lastexecute() {
		System.out.println("I will execute At Last");
	}
	
	@AfterSuite
	public void suite() {
		System.out.println("I am servant");
	}

}
