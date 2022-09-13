package billing;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;

public class Billing extends Baseclass {
	
	
	@Test
	
	public void billing() throws InterruptedException, IOException {
		
		LoginTest lp = new LoginTest();
		lp.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='#/dashboard/accounts-payables/pending-review']")).click();
		
		driver.findElement(By.xpath("//a[@href='#/dashboard/administrator/settings']//img[@class='homelefticon']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Billing']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Billing History']")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/span[1]")).click();
		
		logger.info("Billing pdf downloaded successfully");
		
		
	}

}
