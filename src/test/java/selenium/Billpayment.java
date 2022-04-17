package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Billpayment extends LoginTest {
	@Test(priority=1)
	public void Billpay() throws InterruptedException {
Thread.sleep(5000);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	driver.findElement(By.xpath("//a[@href='#/dashboard/accounts-payables/pending-review']")).click();
	driver.findElement(By.xpath("//span[@class='statusInfo uploaded']")).click();
	driver.findElement(By.xpath("//button[contains(text(), 'Quick Pay')]")).click();
	driver.findElement(By.xpath("//button[contains(text(), 'Pay now')]")).click();
	driver.findElement(By.xpath("//button[contains(text(), 'Confirm')]")).click();
	
	WebElement Billsubmission= driver.findElement(By.xpath("//h5[contains(text(), 'Bill has been submitted successfully')]"));
	String actual=Billsubmission.getText();
	String expected="Bill has been submitted successfully";
	Assert.assertEquals(actual, expected);
System.out.println("Test is passed");
	
	
	driver.findElement(By.xpath("//button[contains(text(), 'Done')]")).click();
	
	}

}