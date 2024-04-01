package PageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import RahulShethyAcademy.AbstractComponents.AbstractComponents;

public class LoginPage extends AbstractComponents{
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement userEmails=driver.findElement(By.id("userEmail"));
	//PageFactory
    @FindBy(id="userEmail")
    WebElement userEmails;
    //WebElement password=driver.findElement(By.id("userPassword"));
    @FindBy(id="userPassword")
    WebElement passwordle;
    //WebElement loginButton=driver.findElement(By.id("login"));
    @FindBy(id="login")
    WebElement loginButton;
    
    @FindBy(css="[class*='flyInOut']")
    WebElement errorMessage;
    
    
    public ProductCatelog ApplicationLogin(String Username,String Password){
    	userEmails.sendKeys(Username);
    	passwordle.sendKeys(Password);
    	loginButton.click();
    	ProductCatelog productlg = new ProductCatelog(driver);
    	return productlg;
    }
    
    public String errorMessageValidation() {
    	waitForElementToAppears(errorMessage);
    	return errorMessage.getText();
    	
    }
    
    public void Goto() {
    	driver.get("https://rahulshettyacademy.com/client");
    }
}
