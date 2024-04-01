import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Windowsactivities {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//selenium manager from selenium 4.6.0
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91930\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.get("https://www.google.com");
        driver.navigate().to("https://rahulshettyacademy.com/locatorspractice");
       // driver.navigate().back();
        
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\91930\\Screenshot.png"));

	}

}
