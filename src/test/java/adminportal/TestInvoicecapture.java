package adminportal;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;

public class TestInvoicecapture extends Baseclass{
	
	
	@Test
	
public void invoicecapture() throws InterruptedException, IOException {
		
		
		LoginTest lp = new LoginTest();
		lp.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		logger.info("Reviewing the invoice capture bill");
	
		driver.findElement(By.xpath("//a[@href='#/dashboard/accounts-payables/pending-review']")).click();
		
		driver.findElement(By.partialLinkText("Scanned")).click();

		driver.findElement(By.xpath("//span[@class='statusInfo scanned']")).click();
		
		driver.findElement(By.name("invoiceNumber")).sendKeys("121");
		driver.findElement(By.xpath("//div[@class='accountFieldTab']")).click();
		driver.findElement(By.id("tab-0-tab-expense")).click();
		List<WebElement> options= driver.findElements(By.xpath("//div[@class='tree-view-item  ']"));
		System.out.println(options.size());
        
      for(int i = 0; i<=options.size()-1; i++) {
           
           
          if(options.get(i).getText().contains("Discounts")) {
               
              options.get(i).click();
              break;
               
          }
      }
      driver.findElement(By.xpath("//button[contains(text(),'Review')]")).click();
      if(driver.findElement(By.xpath("//h5[contains(text(),'Bill ')]")).isDisplayed());
      {
    	  Assert.assertTrue(true);
      }
     
      
	
}

}
