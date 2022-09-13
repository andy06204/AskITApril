package quickbooks;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;
@Test
public class QBVendorsync extends Baseclass{
	public void qbdsync() throws InterruptedException, IOException {
Thread.sleep(5000);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	LoginTest lp=new LoginTest();
	lp.login();
	driver.findElement(By.xpath("//p[contains(text(),'View, update and manage your vendors')]")).click();
	driver.findElement(By.xpath("//button[normalize-space()='Sync Vendors']")).click();
	

	
}
}
