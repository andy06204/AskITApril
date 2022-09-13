package customers;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;

public class Addcustomer extends Baseclass {
	public String companyname="company231";
	public String customername="VSTTT";
	public String taxno="193030301";
	public String Addressline1="address";
	public String Addressline2="";
	public String Addressline3="";
	public String Addressline4="";
	public String Addressline5="";
	public String zipcode="50005";
	public String fname="Abhi";
	public String lname="kumar";
	

	@Test
	
	public void addcustomer() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		LoginTest lp = new LoginTest();
		lp.login();
		
		
		driver.findElement(By.xpath("//a[@href='#/dashboard/customer/list']//div[@class='servicesInfo']")).click();
		

		driver.findElement(By.xpath("//button[normalize-space()='Add Customer']")).click();

		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys(companyname);
		
		driver.findElement(By.xpath("//input[@name='vendorName']")).sendKeys(customername);
		driver.findElement(By.xpath("//input[@name='taxNo']")).sendKeys(taxno);
		driver.findElement(By.name("firstName")).sendKeys(fname);
		driver.findElement(By.name("lastName")).sendKeys(lname);
		driver.findElement(By.name("emailAddress")).sendKeys(randomestring()+"@getnada.com");
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		
		
		driver.findElement(By.xpath("//input[@name='addressLine1']")).sendKeys(Addressline1);
		driver.findElement(By.xpath("//input[@name='addressLine2']")).sendKeys(Addressline2);
		driver.findElement(By.xpath("//input[@name='addressLine3']")).sendKeys(Addressline3);
		driver.findElement(By.xpath("//input[@name='addressLine4']")).sendKeys(Addressline4);
		driver.findElement(By.xpath("//input[@name='addressLine5']")).sendKeys(Addressline5);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Search Country...')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'United States')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Search State/Province...')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Arizona')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Search City...')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Ajo')]")).click();
	
//	List<WebElement> allOptions = driver.findElements(By.tagName("//div"));
//       System.out.println(allOptions.size());
//       for(int i = 0; i<=allOptions.size()-1; i++) {
//           
//           
//           if(allOptions.get(i).getText().contains("Ajo")) {
//                
//               allOptions.get(i).click();
//               break;
//           }
//       }
         
                 
  
driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys(zipcode);
driver.findElement(By.xpath("//input[@style='width: 16px; height: 16px;']")).click();

Thread.sleep(5000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,350)", "");

driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();

	}

		
		
		
		
		
	}

