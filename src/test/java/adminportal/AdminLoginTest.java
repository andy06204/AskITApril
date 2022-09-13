package adminportal;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AdminLoginTest extends AdminBaseclass {
	
	@Test
	public void Adminlogin() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		logger.info("Entered Url");
		
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	Thread.sleep(3000);
	}
	

}
