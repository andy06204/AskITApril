package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Readconfig;

public class Baseclass {
	Readconfig read= new Readconfig();
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
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}
	@AfterClass
	
	
	public void teardown() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}
}
