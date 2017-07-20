package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser implements BrowserInit{
WebDriver driver;
	
	public WebDriver Init()
	{
		String driverpath = null;
		
		System.setProperty("Webdriver.InternetExplorer.driver", driverpath+"InternetExplorerdriver.exe");
		driver =new InternetExplorerDriver();
		 return driver;
	}
}
