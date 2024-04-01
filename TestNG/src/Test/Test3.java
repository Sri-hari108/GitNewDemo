package Test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3 {
        @BeforeClass
        public void Class() {
        	System.out.println("Execute before any method in a class");
        }
        @AfterClass(enabled=false)
        public void Class1() {
        	System.out.println("Execute after all methods in a class");
        }
	    @Test
		public void WebLoginCarLoan() {
		System.out.println("Hare");
		}
	    
	    @Test(timeOut=4000)
		public void MobileLoginCarLoan() {
		System.out.println("Krishna");
		}
	    
	    @Test(dependsOnMethods= {"WebLoginCarLoan"})
		public void APILoginCarLoan() {
		System.out.println("Rama");
		}
	    
	    @BeforeSuite
	    public void suite() {
	    	System.out.println("I am supreme personality of GODHEAD");
	    }
	   

}
