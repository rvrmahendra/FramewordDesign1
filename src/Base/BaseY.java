package Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseY {

	public static WebDriver driver;
	BrowserProvider bp=new BrowserProvider();
	@Parameters({"browser"})
	@BeforeClass
	public void browserInitiate(String browser)
	{
		setDriver(browser);
		System.out.println("e43");
	}
	
	public WebDriver getDriver(){
		System.out.println("e45");
		return driver;
	}

	public void setDriver(WebDriver driver){
		System.out.println("e46");
		this.driver=driver;
	}

	public void setDriver(String browser){
		//String f="ff";
		System.out.println("e44");
		driver=bp.meth(browser).Init();
	}
}
