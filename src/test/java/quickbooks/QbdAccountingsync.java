package quickbooks;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageobjects.Accountingpage;
import selenium.Baseclass;
import selenium.LoginTest;

public class QbdAccountingsync extends Baseclass {
	public String Accountname=randomestring();
	public String AccountId=randomeNum();
		
		@Test
		public void Account() throws InterruptedException, IOException {
			
			LoginTest lp = new LoginTest();
			lp.login();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			Accountingpage pg =new Accountingpage(driver);
			pg.setting();
			pg.Accounting(); 
			driver.findElement(By.xpath("//button[normalize-space()='Sync Accounts']")).click();
			
			
			
		}

}
