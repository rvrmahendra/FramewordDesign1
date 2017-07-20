package Suite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import Base.*;

public class Suiteclass extends BaseY{

	private WebDriver driver;

	@BeforeTest
	public void Startsuite(){
		driver=getDriver();
		
	}
}
