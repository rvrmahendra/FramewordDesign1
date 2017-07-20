package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements BrowserInit {
WebDriver driver;
	
	public WebDriver Init()
	{
		driver =new FirefoxDriver();
		return driver ;
	}
}
