package selenium;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CreateBill extends Baseclass {
	
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
		
		searchbox.sendKeys("new");//Enter the name of vendor here
		searchbox.sendKeys(Keys.ENTER);// select the vendor
		
		driver.findElement(By.name("invoiceNumber")).sendKeys("1001");//Enter Billno
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/div[1]/button[2]")).click();
		selectdate("1","April","2022");
		//driver.findElement(By.xpath("//tbody/tr[3]/td[2]/div[1]/div[1]/div[1]/button[2]")).click();
		selectdate("5","April","2022");
		

	}
	
	
	public static String[] getmonthyear(String monthyearval) {
		
		return monthyearval.split(" ");
		
	}
	
	public static void selectdate(String exday,String exmonth,String exyear) throws InterruptedException {
		WebElement date=driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']"));
		
		String monthyearval= date.getText();
		System.out.println(monthyearval);
		
		
		while (!(getmonthyear(monthyearval)[0].equals(exmonth) && getmonthyear(monthyearval)[1].equals(exyear))) {
			
			driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']")).click();
			monthyearval= date.getText();
			
		}
		driver.findElement(By.xpath("//abbr[text()='"+exday+"']")).click();
	}
	
		
		
		//driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/div[1]/button[2]")).click();
		
	
		
		
	}	
		
		
		
		
		
