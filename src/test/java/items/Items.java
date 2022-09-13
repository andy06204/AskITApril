package items;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;

public class Items  extends Baseclass{
	public String item=randomestring();
	public String unitprice=randomeNum();
	public String description="Enter some description";
	public String incomeaccount="Sales";
	
	
	@Test
	
public void Item() throws InterruptedException, IOException {
	
		
		LoginTest lp = new LoginTest();
		lp.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='#/dashboard/administrator/settings']//img[@class='homelefticon']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Accounting']")).click();
		driver.findElement(By.xpath("//a[@href='#/dashboard/administrator/settings/accounts/account-items']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='New']")).click();

		
		driver.findElement(By.name("itemName")).sendKeys(item);
		driver.findElement(By.name("unitPrice")).sendKeys(unitprice);
		driver.findElement(By.name("description")).sendKeys(description);
		Thread.sleep(5000);
		driver.findElement(By.name("isSell")).click();
		
		

		  driver.findElement(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']")).click();
		  
		  Thread.sleep(5000);
			  
		 WebElement searchbox= driver.findElement(By.xpath("//input[@id='react-select-2-input']"));
		
		 
		 
		 
		 searchbox.sendKeys(incomeaccount);
		 searchbox.sendKeys(Keys.ENTER);
		 
//		 String text;
//		 do {
//			 searchbox.sendKeys(Keys.ARROW_DOWN);
//			 text=searchbox.getAttribute("value");
//			 if (text.equals("Abhi")) {
//				 
//				 searchbox.sendKeys(Keys.ENTER);
//				 break;
//				
//			}
//			
//		} while (!text.isEmpty());
//	

driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
logger.info("Item has been added succesfully");
Thread.sleep(2000);
WebElement text=driver.findElement(By.xpath("//h5[normalize-space()='Item has been added successfully.']"));
if (text.getText().contains("Item has been added successfully")) {
	Assert.assertTrue(true);
	
}else
{
	Assert.assertTrue(false);
}
			     }
			    

    

 

     
	

             
        }
    

	

		
	

