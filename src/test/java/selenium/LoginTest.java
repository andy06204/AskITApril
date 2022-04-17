package selenium;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import pageobjects.Loginpage;

public class LoginTest extends Baseclass {
	
	

		
		@Test
	public void login() throws InterruptedException, IOException
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			logger.info("Entered Url");
			
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
		lp.btn_click();
		
		lp.login_fintainium(username, password);
		
//		driver.findElement(By.xpath("//button[@type='button']")).click();
	
//		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(username);
	
		logger.info("Entered password");
		
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	logger.info("Entered password");
	lp.btn_click1();
	driver.findElement(By.xpath("//input[@type='radio' and @value='71720']")).click();
	
	driver.findElement(By.xpath("//div[@class='col-md-5']//button[@type='button']")).click();
		
		//driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		Thread.sleep(5000);
		
		String title= driver.getTitle();
		
		System.out.println(title);
		
		if (driver.getTitle().equals(title)) {
			Assert.assertTrue(true);
			logger.info("Test case passed");
			}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Test case failed");
		}
		
		}
		
		
		
		
		
		

}

