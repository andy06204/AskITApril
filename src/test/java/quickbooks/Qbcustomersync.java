package quickbooks;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;

public class Qbcustomersync extends Baseclass{
	
	@Test
	public void qbdsync() throws InterruptedException, IOException {
Thread.sleep(5000);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	LoginTest lp=new LoginTest();
	lp.login(); 
	driver.findElement(By.xpath("//a[@href='#/dashboard/customer/list']//div[@class='servicesInfo']")).click();
	
	driver.findElement(By.xpath("//button[normalize-space()='Sync Customers']")).click();

}
}
