package quickbooks;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;

public class QBItemssync extends Baseclass {
	
	@Test
	public void qbdsync() throws InterruptedException, IOException {
Thread.sleep(5000);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	

	LoginTest lp = new LoginTest();
	lp.login();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@href='#/dashboard/administrator/settings']//img[@class='homelefticon']")).click();
	
	driver.findElement(By.xpath("//a[normalize-space()='Accounting']")).click();
	driver.findElement(By.xpath("//a[@href='#/dashboard/administrator/settings/accounts/account-items']")).click();
	
	driver.findElement(By.xpath("//button[normalize-space()='Sync Items']")).click();

}
}
