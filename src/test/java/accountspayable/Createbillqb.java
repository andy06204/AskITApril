package accountspayable;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.Datepicker;
import selenium.LoginTest;

public class Createbillqb extends Baseclass {
	public String vendorname="new";
	public String items="Telephone";
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
	
		
		driver.findElement(By.xpath("//div[contains(@class,' css-1hwfws3')]//div[contains(text(),'Search..')]")).click();
		WebElement searchbox=driver.findElement(By.xpath("//div[@class='css-1g6gooi']//input"));
		logger.info("vendor is entered");
		searchbox.sendKeys(vendorname);//Enter the name of vendor here
		searchbox.sendKeys(Keys.ENTER);// select the vendor
		logger.info("Bill is entered");
		driver.findElement(By.name("invoiceNumber")).sendKeys(billno);//Enter Billno
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div[1]/div[1]/div[1]/button[2]")).click();
		Datepicker d= new Datepicker();
		d.selectdate("15","May","2022");
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/div[1]/button[2]")).click();
		d.selectdate("1","May","2022");
		logger.info("Billdate is entered");

Thread.sleep(5000);
logger.info("po is entered");
	driver.findElement(By.name("invoicePO")).sendKeys(invpo);
	//driver.findElement(By.xpath("(//div[contains(@class,'css-1wa3eu0-placeholder')][normalize-space()='Search...'])[2]")).sendKeys("Net 15");
	WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Add lines')][1]"));
	button.click();
	Thread.sleep(3000);
	
	//WebElement Select=driver.findElement(By.xpath("(//div[contains(@class,'css-1wa3eu0-placeholder')][normalize-space()='Search...'])[3]"));
	WebElement serch=driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", serch);
	Actions a = new Actions(driver);
a.moveToElement(serch).perform();

serch.click();

driver.findElement(By.xpath("//div[contains(text(),'Telephone')]")).click();

//boolean x=serch.isDisplayed();
//if (x) {
//	serch.click();
//	serch.sendKeys(items);
//	serch.sendKeys(Keys.ENTER);
//}
//driver.findElement(By.xpath("//li[contains(text(),'"+items+"')]")).click();


		driver.findElement(By.name("expenseLineItems.0.unitPrice")).clear();
		driver.findElement(By.name("expenseLineItems.0.unitPrice")).sendKeys("10");
		//driver.findElement(By.name("totalTax")).clear();
//		driver.findElement(By.name("totalTax")).sendKeys("10");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	logger.info("Bill is created");
		}
	
	

	// TODO: handle exception

	}


	
	
	
	
	
	
	
	
	
	
	

