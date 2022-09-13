package adminportal;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.AdminConfig;


public class AdminBaseclass {
	AdminConfig read= new AdminConfig();
	public String url =read.getApplicationURL();
	public String username=read.getUsername();
	public String password=read.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	
	@BeforeClass
	public void setup() {
		
		logger = Logger.getLogger("finatinium");
		PropertyConfigurator.configure("Log4j.properties");
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
	
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}
	

}
