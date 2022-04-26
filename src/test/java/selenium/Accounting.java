package selenium;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import  pageobjects.Loginpage;

public class Accounting extends Baseclass {
public String Accountname=randomestring();
public String AccountId=randomeNum();
	
	@Test
	public void Account() throws InterruptedException, IOException {
		
		LoginTest lp = new LoginTest();
		lp.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='#/dashboard/administrator/settings']//img[@class='homelefticon']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Accounting']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='New']")).click();
		WebElement account = driver.findElement(By.name("accountType"));
Select objSelect = new Select(account);
		
		objSelect.selectByVisibleText("Income");
		driver.findElement(By.name("name")).sendKeys(Accountname);
		driver.findElement(By.name("accountNumber")).sendKeys(AccountId);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		WebElement text=driver.findElement(By.xpath("//h5[contains(text(),'Account has been added successfully.')]"));
//		if (text.getText().contains("Account has been added successfully.")) {
//			Assert.assertTrue(true);
//			
//		}else
//		{
//			Assert.assertTrue(false);
//		}
					     }	
		
		
		
		
}
	

