import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91930\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		// -------------------Selecting Static dropdown when Select Tagname is present----------------
		/*
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		*/
	
		//--------------------------------Selecting Static dropdown when without Select Tagname----------------------------------------------------------//
		
		/*
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		//driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div/div[2]/div[2]")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Passengers']/following::div[2]")).getText());
		for(int i=1;i<=3;i++) {		
		driver.findElement(By.xpath("(//div[contains(@class,'aockid')])[2]")).click();
			
		}
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Passengers']/following::div[2]")).getText());
		
		*/
	//--------------------Dynamic Dropdown------------------------------------------------------------	
		/*
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[text()='From']")).click();
		//driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div/div[2]/input")).click();
			
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-u8s1d r-8fdsdq'] //div[text()='DBR']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='VTZ']")).click();
		*/
		
		//----------------AutoSuggestive Dropdown--------
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement> optios=driver.findElements(By.xpath("//li[@class='ui-menu-item']//child::a"));
		for(WebElement option: optios) {
			if(option.getText().equalsIgnoreCase("India")){
				option.click();
				break;
			}
		}
		
		//-----------------------------Selecting CheckBoxes,Number of checkboxes and assertion-----------------------------------------
		/*
		driver.get("https://www.spicejet.com/");
		Assert.assertFalse(driver.findElement(By.xpath("(//*[@stroke='#DDDDDD'])[3]")).isSelected());
		System.out.println(driver.findElement(By.xpath("(//*[@stroke='#DDDDDD'])[3]")).isSelected());
		driver.findElement(By.xpath("(//*[@stroke='#DDDDDD'])[3]")).click();
		
		driver.findElement(By.xpath("(//*[@stroke='#DDDDDD'])[3]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("(//*[@stroke='#F7941D'])[2]")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("(//*[@stroke='#F7941D'])[2]")).isSelected());
		//number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("*[stroke='#DDDDDD']")).size());
		*/
	}

}
