package Base;

import org.openqa.selenium.WebDriver;

public class BrowserProvider {
	private WebDriver driver;
	
	
	 
	 
	public BrowserInit meth(String browser)
	{
		if(browser.equalsIgnoreCase("ff"))
		{
			
			return  new Firefox();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			
			return new ChromeBrowser();
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			return new IEBrowser();
		
		}
		return new Firefox();

		 
		
		
	}
}
