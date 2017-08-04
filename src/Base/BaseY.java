package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseY {

	public WebDriver driver;
	BrowserProvider bp=new BrowserProvider();
	@Parameters({"browser"})
	@BeforeClass
	public void browserInitiate(String browser) throws IOException
	{
		Initialbrowser(browser);
		//driver.get("http://www.gmail.com");
		System.out.println("e43");
	}
	
	
	public void Initialbrowser(String browser) throws IOException{
		setDriver(browser);
		
	}
	public WebDriver getDriver()
	{
		return driver;
	}
	public  void setDriver(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebDriver setDriver(String browser) throws IOException{
		//String f="ff";
		System.out.println("e44");
		driver=bp.meth(browser).Init();
		return driver;
	}
}
