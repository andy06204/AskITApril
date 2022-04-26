package selenium;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Reports extends Baseclass {

	@Test
	public void reports() throws InterruptedException, IOException {

		LoginTest lp = new LoginTest();
		lp.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='#/dashboard/reports']")).click();
		
		driver.findElement(By.linkText("Bill Payments")).click();
		
		WebElement element1=driver.findElement(By.xpath("//select[@id='payment-method']"));
		element1.click();
		
        List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='payment-method']//option"));
        System.out.println(allOptions.size());                                           
        for(int i = 0; i<=allOptions.size()-1; i++) {
             if(allOptions.get(i).getText().contains("CHECK")) {
                    allOptions.get(i).click();
                break;
                

                
		}
             logger.info("Entered payment method");
             WebElement element2=driver.findElement(By.xpath("//body/div[@id='app-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]"));
             
             element2.click();
             //element2.sendKeys(Keys.ENTER);
             String bank="Bank of America ( xxxxxxxxxx1)";
             List<WebElement> allOptions1 = driver.findElements(By.xpath("//body/div[@id='app-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/select[1]//option"));
             System.out.println(allOptions1.size());                                           
             for(int j = 0; j<=allOptions1.size()-1; j++) {
                  if(allOptions1.get(j).getText().contains(bank)){
                         allOptions1.get(j).click();
                     break;
                     }
             }
             Thread.sleep(5000);
             WebElement element3 =driver.findElement(By.xpath("//div[@class='overSelect']"));
             if(element3.isDisplayed()) {
            	 element3.click();
             }else {
            	 System.out.println("Element not available");
             }
             String status="Processing";
             driver.findElement(By.xpath("//input[@name='"+status+"']")).click();
             
             
      Select month= new Select(driver.findElement(By.xpath("//select[@id='report-period']")));
      month.selectByVisibleText("This Month");
      Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@role='button']")).click();
    driver.findElement(By.xpath("//ul//li//a[contains(text(),'EXCEL')]")).click();
             
             
            
			}
            
            	 
             
				
				}
            	 }
				
        
      
        	
	

	

		
		
		
		
		

		
		
		
		
	

