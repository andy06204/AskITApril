package selenium;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvoicePayment  extends Baseclass{
	
	
	@Test
	public void invoice() throws InterruptedException, IOException {
		LoginTest lp = new LoginTest();
		lp.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='#/dashboard/accounts-receivables/draft']")).click();
//		
//	driver.findElement(By.xpath("//span[contains(text(),'OPEN')]")).click();
////		
//	driver.findElement(By.xpath("//button[contains(text(),'Send')]")).click();
////		
//	driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();	
//	driver.findElement(By.xpath("//button[contains(text(),'Return')]")).click();
		Thread.sleep(5000);
	//String actual=driver.findElement(By.xpath("//h5[contains(text(),'Invoice sent successfully.')]")).getText();
//		String expected="Invoice sent successfully.";
		
		driver.findElement(By.xpath("//a[normalize-space()='Sent']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'SENT')]")).click();
		WebElement getsharelink=driver.findElement(By.xpath("//button[contains(text(),'Get Share Link')]"));
		getsharelink.click();
		
		
		Thread.sleep(2000);
		WebElement  element=driver.findElement(By.xpath("//div[@class='text-center col-md-12']/following::div[contains(text(),'preprod')]"));
		String link=element.getText();
		System.out.println(link);
	WebElement copylink=driver.findElement(By.xpath("//button[contains(text(),'Copy Link')]"));
		copylink.click();
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get(link);
	
		driver.findElement(By.xpath("//strong[contains(text(),'Skip this step')]")).click();
		Thread.sleep(4000);
	
		//Locating element by link text and store in variable "Element"  
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(4000);
      driver.findElement(By.xpath("//input[@name='accountName']")).sendKeys("Test");
      Select paymentmethod = new Select(driver.findElement(By.name("bankListId")));
      paymentmethod.selectByVisibleText("Bank of America");
        
     String accountnumber= randomeNum();
     String routingnumber="121000358";
     String signature=randomestring();
      driver.findElement(By.name("accountNumber")).sendKeys(accountnumber);
      driver.findElement(By.name("routingNumber")).sendKeys(routingnumber);
      driver.findElement(By.name("accountHolderSignature")).sendKeys(signature);
      driver.findElement(By.xpath("//button[@type='submit']")).click();
     
      logger.info("invoice payment done");
		

		
		
		
		
	}

}
