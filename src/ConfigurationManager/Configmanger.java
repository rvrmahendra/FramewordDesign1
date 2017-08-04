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
		file=new FileInputStream(System.getProperty("user.dir")+"//MY//Config//Sys.properties");
		pro.load(file);
		String profilevalue=pro.getProperty("Firefoxprofile");
		return profilevalue;
		}
		else
		return null;
	}

	public boolean Firefoxprofile() {
		// TODO Auto-generated method stub
		String profilevalue=pro.getProperty("Firefoxprofile");
		if(profilevalue.equalsIgnoreCase(null)){
			return false;
		}
		else
			return true;
	}
}
