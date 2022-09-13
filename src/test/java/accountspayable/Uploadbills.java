package accountspayable;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;

public class Uploadbills extends Baseclass {
	@Test
public void upload() throws InterruptedException, IOException, AWTException {
		
		LoginTest lp = new LoginTest();
		lp.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='#/dashboard/accounts-payables/pending-review']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Upload Bills']")).click();
		WebElement element=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/form/div/div/div/div/button"));
		element.click();
		Thread.sleep(2000); // suspending execution for specified time period
		 
	    // creating object of Robot class
	    Robot rb = new Robot();
	 
	    // copying File path to Clipboard
	    StringSelection str = new StringSelection("C:\\Users\\16475\\Desktop\\myfiles\\invoice_upload_new20.csv");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(5000);
//	    WebElement actual=driver.findElement(By.xpath("//h5[contains(text(),'Uploaded file has been processed successfully')]"));
//	    String expected=actual.getText();
//	    System.out.println(expected);
	   // Assert.assertEquals(actual.getText(), expected);
//	    if (actual.isDisplayed()) {
//			Assert.assertTrue(true);
//		}
}
	
	
	
}

