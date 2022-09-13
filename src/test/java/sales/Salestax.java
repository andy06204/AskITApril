package sales;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;


public class Salestax extends Baseclass {
	
	public String taxname=randomestring();
	public String taxrate="35";

	
	
	@Test
	public void sales() throws InterruptedException, IOException {
		
		LoginTest lp = new LoginTest();
		lp.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='#/dashboard/administrator/settings']//img[@class='homelefticon']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Accounting']")).click();
		
		driver.findElement(By.linkText("Sales Tax")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Create Sales Tax']")).click();
		driver.findElement(By.name("taxName")).sendKeys(taxname);
		driver.findElement(By.name("taxRate")).sendKeys(taxrate);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String text=driver.findElement(By.xpath("//h5[contains(text(),'Tax created successfully')]")).getText();
		System.out.println(text);
		
	}
}
