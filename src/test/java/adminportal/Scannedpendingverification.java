

package adminportal;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scannedpendingverification extends AdminBaseclass {
	public String filename="InvoiceSimple";
	@Test
	public void pendingverification() throws InterruptedException{
		AdminLoginTest lp= new AdminLoginTest();
		lp.Adminlogin();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@href='#/dashboard/invoice-capture']//img[@class='homelefticon']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Pending Verification']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'PENDING')]/following::td[contains(text(),'"+filename+"')]")).click();
		Thread.sleep(10000);
		
WebElement element=driver.findElement(By.xpath("//button[@type='submit']"));
((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	element.click();
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
	}
		
	}
	


