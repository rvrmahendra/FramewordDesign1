package ConfigurationManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configmanger {

	Properties pro=new Properties();
	FileInputStream file;
public String getprofile(String name) throws IOException{
		String value=" ";
		if(name.equalsIgnoreCase("sys")){
		file=new FileInputStream("C:\\sel\\MY\\Config\\Sys.properties");
		pro.load(file);
		String d=pro.getProperty("Test");
		System.out.println("erd"+d);
		String profilevalue=pro.getProperty("Firefoxprofile");
		return profilevalue;
		}
		else
		return null;
	}

	public boolean Firefoxprofile() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("e64");
		file=new FileInputStream("C:\\sel\\MY\\Config\\Sys.properties");
		pro.load(file);
		
		String profilevalue=pro.getProperty("Firefoxprofile");
		String tr=pro.getProperty("Test");
		System.out.println("e66"+profilevalue);
		if(profilevalue.equalsIgnoreCase("no")){
			System.out.println("e65");
			return false;
		}
		else
			return true;
	}
}
