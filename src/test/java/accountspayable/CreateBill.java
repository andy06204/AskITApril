package accountspayable;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.Datepicker;
import selenium.LoginTest;

public class CreateBill extends Baseclass {
	public String vendorname="VSTTa";
	public String items="item100";
	public String billno="1012";
	public String invpo="1";
	
	@Test
	
	public void createbill() throws InterruptedException, IOException {
		LoginTest lp = new LoginTest();
		lp.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='#/dashboard/accounts-payables/pending-review']")).click();
		driver.findElement(By.xpath("//button[@class='blue-btn btn btn-default']")).click();
		Thread.sleep(5000);
	
		
		driver.findElement(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']")).click();
		WebElement searchbox=driver.findElement(By.xpath("//div[@class='css-1g6gooi']//input"));
		logger.info("vendor is entered");
		searchbox.sendKeys(vendorname);//Enter the name of vendor here
		searchbox.sendKeys(Keys.ENTER);// select the vendor
		logger.info("Bill is entered");
		driver.findElement(By.name("invoiceNumber")).sendKeys(billno);//Enter Billno
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div[1]/div[1]/div[1]/button[2]")).click();
		Datepicker d= new Datepicker();
//		d.selectdate("1","May","2022");
		Thread.sleep(5000);
	driver.findElement(By.xpath("(//button[@type='button'])[15]")).click();
	d.selectdate("15","September","2022");
//		logger.info("Billdate is entered");

Thread.sleep(5000);
logger.info("po is entered");
	driver.findElement(By.name("invoicePO")).sendKeys(invpo);
//	driver.findElement(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']")).click();
//	driver.findElement(By.xpath("//div[contains(text(),'Net 10')]")).click();


Thread.sleep(5000);
	
	//driver.findElement(By.name("term")).sendKeys("Net 15");
//
//	//scroll down a page
//	a.sendKeys(Keys.PAGE_DOWN).build().perform();
//	Thread.sleep(10000);
	WebElement button=driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Add lines'])[2]"));
	button.click();
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(items);
	Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Unit price']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@placeholder='Unit price']")).sendKeys("1");
		driver.findElement(By.name("totalTax")).clear();
//		driver.findElement(By.name("totalTax")).sendKeys("10");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	logger.info("Bill is created");
		}
	}
//	
//catch (Exception e) {
//	// TODO: handle exception
//}
//	}
//}

		
		
	


























//WebElement serch=driver.findElement(By.xpath("//input[@placeholder = 'Search..']"));
//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='accountFieldTab']")))).click();
//driver.findElement(By.xpath("//div[@class='accountFieldTab']")).sendKeys("bank");
//
//a.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'"+items+"')]"))).click();
//
//logger.info("item is entered");
//
//	
	
	
//	driver.findElement(By.xpath("//div[@class='tree-view-item  hasSubMenu']")).click();
//	
	


	
		
		
		
		
		
		
		
