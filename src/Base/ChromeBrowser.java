package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser implements BrowserInit{
WebDriver driver;
	
	public WebDriver Init()
	{
		String driverpath = null;
		System.setProperty("webdriver.chrome.driver", driverpath+"chromedriver.exe");
		driver= new ChromeDriver();
		return driver;
	}

}
