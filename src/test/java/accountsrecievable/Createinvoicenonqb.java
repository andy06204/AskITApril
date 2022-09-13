package accountsrecievable;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;

public class Createinvoicenonqb extends Baseclass {
	public String customername="customernew";
	public String invcno=randomeNum();
	public String items="Services";
	public String Rate="1.00";
	public String QTY="1";
	public String email=",abhi.katt@getnada.com";
	public String terms="Net 15";
	public String Invoicedate="September 12, 2022";
	public String Invoiceduedate="September 24, 2022";
	@Test
public void createinvoice() throws InterruptedException, IOException {
	
		
		LoginTest lp = new LoginTest();
		lp.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//p[normalize-space()='Create, send, and get paid for your invoices']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Create Invoice']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,' css-1hwfws3')]//div[contains(text(),'Search..')]")).click();
		WebElement search=driver.findElement(By.xpath("//div[@class='css-1g6gooi']//input"));
		
		search.sendKeys(customername);//Enter the name of customername here
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);// select the customer
		driver.findElement(By.name("emailAddress")).sendKeys(email);
		driver.findElement(By.name("invoiceNumber")).sendKeys(invcno);//Enter invcno
		Thread.sleep(5000);
		driver.findElement(By.name("invoiceNumber")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//abbr[@aria-label='"+Invoicedate+"']")).click(); 
		driver.findElement(By.xpath("(//button[@type='button'])[55]")).click();
		driver.findElement(By.xpath("(//abbr[@aria-label='"+Invoiceduedate+"'][normalize-space()='24'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='invoicePO']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@placeholder='Enter term']")).sendKeys(terms);
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);
		WebElement Select=driver.findElement(By.xpath("(//div[@id='textWrapI0'])[1]"));
		a.moveToElement(Select).perform();
		Thread.sleep(5000);
		WebElement serch=driver.findElement(By.xpath("(//input[@placeholder='Search..'])[2]"));
		boolean x=serch.isDisplayed();
		if (x) {
			serch.click();
			serch.sendKeys(items);
			serch.sendKeys(Keys.ENTER);
		}
		driver.findElement(By.xpath("//li[contains(text(),'"+items+"')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Unit price']")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.xpath("//input[@placeholder='Unit price']")).sendKeys(Keys.CONTROL+"x");
		driver.findElement(By.xpath("//input[@placeholder='Unit price']")).sendKeys(Rate);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Quantity']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@placeholder='Quantity']")).sendKeys(QTY);
	
		JavascriptExecutor jss = (JavascriptExecutor) driver;
	       jss.executeScript("window.scrollBy(0,-250)", "");
	   	Thread.sleep(5000);
	     driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Save and close'])[2]")).click();
}
}
