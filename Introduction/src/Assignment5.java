import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//*[text()='Multiple Windows']")).click();
		driver.findElement(By.cssSelector("div[id='content'] div a")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> st=windows.iterator();
		String parentId=st.next();
		String childId=st.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.cssSelector("div[id='content'] div h3")).getText());
	}

}
