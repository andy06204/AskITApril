package quickbooks;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;

public class QBSyncTAb extends Baseclass {
	@Test
	public void synctab() throws InterruptedException, IOException {
		
		LoginTest lp = new LoginTest();
		lp.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='#/dashboard/administrator/settings']//img[@class='homelefticon']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Sync']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//button[@type='Button'][normalize-space()='Sync'])[1]")).click();
		driver.findElement(By.xpath("(//*[name()='svg'][@class='closeNotification'])[1]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//button[@type='Button'][normalize-space()='Sync'])[2]")).click();
		driver.findElement(By.xpath("(//*[name()='svg'][@class='closeNotification'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type='Button'][normalize-space()='Sync'])[3]")).click();
		driver.findElement(By.xpath("(//*[name()='svg'][@class='closeNotification'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type='Button'][normalize-space()='Sync'])[4]")).click();
		driver.findElement(By.xpath("(//*[name()='svg'][@class='closeNotification'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type='Button'][normalize-space()='Sync'])[5]")).click();
		driver.findElement(By.xpath("(//*[name()='svg'][@class='closeNotification'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type='Button'][normalize-space()='Sync'])[6]")).click();
		driver.findElement(By.xpath("(//*[name()='svg'][@class='closeNotification'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type='Button'][normalize-space()='Sync'])[7]")).click();
		driver.findElement(By.xpath("(//*[name()='svg'][@class='closeNotification'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type='Button'][normalize-space()='Sync'])[8]")).click();
		driver.findElement(By.xpath("(//*[name()='svg'][@class='closeNotification'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type='Button'][normalize-space()='Sync'])[9]")).click();
		driver.findElement(By.xpath("(//*[name()='svg'][@class='closeNotification'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type='Button'][normalize-space()='Sync'])[10]")).click();
		driver.findElement(By.xpath("(//*[name()='svg'][@class='closeNotification'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type='Button'][normalize-space()='Sync'])[11]")).click();
		driver.findElement(By.xpath("(//*[name()='svg'][@class='closeNotification'])[1]")).click();
		
	}

}
