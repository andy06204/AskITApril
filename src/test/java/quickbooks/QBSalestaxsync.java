package quickbooks;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;

public class QBSalestaxsync extends Baseclass {
	@Test
	public void salestax() throws InterruptedException, IOException {
		
		LoginTest lp = new LoginTest();
		lp.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='#/dashboard/administrator/settings']//img[@class='homelefticon']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Accounting']")).click();
		
		driver.findElement(By.linkText("Sales Tax")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Sync Sales Tax']")).click();

}
}
