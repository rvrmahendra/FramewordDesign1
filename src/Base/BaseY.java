package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.openqa.selenium.support.events.*;
import org.apache.log4j.*;

import listener.*; 
@Listeners({listener.TestListener.class})
public class BaseY {

	public WebDriver driver;
	BrowserProvider bp=new BrowserProvider();
	private Logger log=Logger.getLogger("BaseY");
	@Parameters({"browser"})
	@BeforeClass
	public void browserInitiate(String browser) throws IOException
	{
		Initialbrowser(browser);
		//driver.get("http://www.gmail.com");
		log.info("browser init------");
		System.out.println("e43");
	}
	
	
	public void Initialbrowser(String browser) throws IOException{
		setDriver(browser);
		registerEventWebDriverListener();
	}
	public void registerEventWebDriverListener() {
		// TODO Auto-generated method stub
		EventFiringWebDriver efd = new EventFiringWebDriver(driver);
		WebListener webl=new WebListener();
		driver=efd.register(webl);
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
