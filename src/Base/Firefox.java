package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import ConfigurationManager.*;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Firefox implements BrowserInit {
WebDriver driver;
	Configmanger config=new Configmanger();
	public WebDriver Init() throws IOException
	{
		if(profilepresent()){
			System.out.println("e55");
				String profilename=config.getprofile("sys");
				ProfilesIni firProfiles = new ProfilesIni();
				FirefoxProfile wbdrverprofile = firProfiles.getProfile("profilename");
				 driver = new FirefoxDriver(wbdrverprofile); 
				 return driver;
			
		}
		else{
			
			System.out.println("e56");
		driver =new FirefoxDriver();
		return driver ;
		}
	}

	private boolean profilepresent() throws IOException {
		// TODO Auto-generated method stub
		
		return config.Firefoxprofile();
	}
}
