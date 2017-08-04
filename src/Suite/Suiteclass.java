package Suite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.*;
import Module.*;
public class Suiteclass extends BaseY{

	public WebDriver driver;
	Loginpage login;

	@BeforeClass
	public void Startsuite(){
	
		login=new Loginpage(getDriver());
		getDriver().get("http://www.gmail.com");
		
	}
	@Test
	public void M(){
		System.out.println("e4");
		login.Sigin();
	
	}
}
