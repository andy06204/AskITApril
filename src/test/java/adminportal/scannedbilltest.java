package adminportal;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class scannedbilltest extends AdminBaseclass {
	
	public String invno="124"; 

	@Test
	public void scannedtest() throws InterruptedException {
		
		AdminLoginTest al=new AdminLoginTest();
		al.Adminlogin();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='#/dashboard/invoice-capture']//img[@class='homelefticon']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Unopened']")).click();
		String filename="InvoiceSimple";
		
		driver.findElement(By.xpath("//span[@class='statusInfo unopened']/following::td[contains(text(),'"+filename+"')]")).click();
		
		driver.findElement(By.xpath("//input[@name='invoiceNumber']")).sendKeys(invno);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div[1]/div[1]/div[1]/button[2]")).click();
		String duedatemonthyear=driver.findElement(By.xpath("//div[@class='react-date-picker__calendar react-date-picker__calendar--open']//button[@type='button'][normalize-space()='June 2022']")).getText();
		System.out.println(duedatemonthyear);
		Thread.sleep(3000);
		
		
		WebElement element=driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div[1]/div[1]/div[1]/button[2]/following::abbr[contains(text(),'19')]"));
		
	
			element.click();
			driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/div[1]/button[2]")).click();
			String monthyear=driver.findElement(By.xpath("//div[@class='react-date-picker__calendar react-date-picker__calendar--open']//button[@type='button'][normalize-space()='June 2022']")).getText();
					System.out.println(monthyear);
					
					driver.findElement(By.xpath("//abbr[contains(text(),'19')]")).click();
					WebElement Element = driver.findElement(By.xpath("//div[contains(text(),'Search Vendor...')]"));
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].scrollIntoView();", Element);
					Element.click();
					Thread.sleep(2000);
					String vendorname="Abhi [ k ]";

			driver.findElement(By.xpath("//input[@id='react-select-3-input']")).sendKeys(vendorname);
			driver.findElement(By.xpath("//input[@id='react-select-3-input']")).sendKeys(Keys.ENTER);
			
			driver.findElement(By.name("invoiceItems.0.name")).sendKeys("apples");
			driver.findElement(By.name("invoiceItems.0.unitPrice")).clear();
			driver.findElement(By.name("invoiceItems.0.unitPrice")).sendKeys("1");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			String expected="Invoice added successfully";
			String actual=driver.findElement(By.xpath("//h5[normalize-space()='Invoice added successfully']")).getText();
			
			Assert.assertEquals(actual, expected);
			
		
			
					
				
	}}

					

		


