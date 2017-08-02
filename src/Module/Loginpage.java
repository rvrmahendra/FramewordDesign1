package Module;
import org.openqa.selenium.WebDriver;

import ActionsP.*;
import Locator.*;

public class Loginpage extends SafeActions implements LoginLocator {
	WebDriver driver;
public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	super(driver);
	this.driver=driver;
	}

public void Sigin(){
	System.out.println("e5");
	driver.get("http://www.gmail.com");
	driver.findElement(emailid).sendKeys("a@a.com");
}



}
