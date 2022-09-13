package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class AdminConfig {
Properties pro;
	
	public AdminConfig()
	{
		File src = new File("./Configurations/admin.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("adminurl");
		return url;
	}
	
	public String getUsername()
	{
	String username=pro.getProperty("adminusername");
	return username;
	}
	
	public String getPassword()
	{
	String password=pro.getProperty("adminpassword");
	return password;
	}

}
