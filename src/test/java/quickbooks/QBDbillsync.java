package quickbooks;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;
@Test
public class QBDbillsync extends Baseclass{
	public void qbdsync() throws InterruptedException, IOException {
Thread.sleep(5000);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	LoginTest lp=new LoginTest();
	lp.login();
	driver.findElement(By.xpath("//a[@href='#/dashboard/accounts-payables/pending-review']")).click();
	driver.findElement(By.xpath("//button[@class='blue-btn syncInvBtn btn btn-default']")).click();
	
//WebElement elmnt=	driver.findElement(By.xpath("//p[contains(text(),'bill has been synced from QuickBooks')]"));
//	
//	elmnt.getText();
//	
	}
}
