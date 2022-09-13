package quickbooks;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;

public class QBBANksync extends Baseclass{
	
	@Test
	public void Addbank() throws InterruptedException, IOException {
		LoginTest lp = new LoginTest();
		lp.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
		driver.findElement(By.xpath("//a[@href='#/dashboard/administrator/settings']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Bank Accounts']")).click(); 
		
		driver.findElement(By.xpath("//button[normalize-space()='Sync Bank Accounts']")).click();
		driver.findElement(By.xpath("//div[@class='chooseSyncBankInsideWrap']")).click();
		
		//driver.findElement(By.xpath("(//input[@name='0'])[1]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		Thread.sleep(10000);
driver.findElement(By.xpath("(//div[@class=' css-1wy0on6'])[1]")).click();
	
		driver.findElement(By.xpath("//input[@name='routingNumber']")).sendKeys("121000358");
		
		driver.findElement(By.xpath("//input[@name='accountNumber']")).sendKeys("");
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Confirm']")).click();
		
		
}
}
