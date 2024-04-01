import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);

		// Add the WebDriver proxy capability.

//		Proxy proxy = new Proxy();
//		proxy.setHttpProxy("myhttpproxy:3337");
//		option.setCapability("proxy", proxy);

		// Add an extention capability.

		// option.addExtensions(new File("C:\\Users\\91930\\Extention\\extension.crx"));
		// option.addArguments("load-extension=C:\\Users\\91930\\Extention\\extension");

		// block pop-up windows
//		option.setExperimentalOption("excludeSwitches",
//		Arrays.asList("disable-popup-blocking"));

		// Set download directory
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("download.default_directory", "/directory/path");
//		option.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91930\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
