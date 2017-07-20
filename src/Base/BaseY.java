package Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

public class BaseY {

	private WebDriver driver;
	BrowserProvider bp=new BrowserProvider();
	
	public WebDriver getDriver(){
		return driver;
	}

	public void setDriver(WebDriver driver){
		this.driver=driver;
	}
	@Parameters({"browser"})
	public void browserInitiate(String browser)
	{
		setDriver(browser);
		
	}
	public void setDriver(String browser){
		driver=bp.meth(browser).Init();
	}
}
