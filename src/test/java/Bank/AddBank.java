package Bank;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;

public class AddBank extends Baseclass{
	
	@Test
	public void Addbank() throws InterruptedException, IOException {
		LoginTest lp = new LoginTest();
		lp.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
		driver.findElement(By.xpath("//a[@href='#/dashboard/administrator/settings']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Bank Accounts']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Add Bank']")).click();
		
		driver.findElement(By.name("accountName")).sendKeys("Abhi");
		driver.findElement(By.xpath("//div[contains(text(),'Search Bank...')]")).click();
		
		driver.findElement(ByCssSelector.cssSelector("#react-select-2-option-5")).click();
		
		driver.findElement(By.name("routingNumber")).sendKeys("121000358");
		driver.findElement(By.name("accountNumber")).sendKeys("183949494499");
		driver.findElement(By.name("address")).sendKeys("100yorksreet");
		driver.findElement(By.xpath("//div[contains(text(),'Search Country...')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'United States')]")).click();
		

		driver.findElement(By.xpath("//div[contains(text(),'Search State/Province...')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Arizona')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Search City...')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Ali Chukson')]")).click();
		List<WebElement> allOptions = driver.findElements(By.tagName("//div"));
        System.out.println(allOptions.size());
         
                 
                 
        for(int i = 0; i<=allOptions.size()-1; i++) {
             
             
            if(allOptions.get(i).getText().contains("Ajo")) {
                 
                allOptions.get(i).click();
                break;
                 
            }
        }
        driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("50005");
        driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
        
		
		
		
		

		
		
	
		
			
		}
			
		
	}
	


