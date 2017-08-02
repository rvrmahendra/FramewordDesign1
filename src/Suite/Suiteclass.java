package Suite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.*;
import Module.*;
public class Suiteclass extends BaseY{

	private WebDriver driver;
	Loginpage login;

	@BeforeTest
	public void Startsuite(){
	
		login=new Loginpage(getDriver());
		
	}
	@Test
	public void M(){
		System.out.println("e4");
		login.Sigin();
	
	}
}
