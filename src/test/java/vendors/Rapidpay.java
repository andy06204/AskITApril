package vendors;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;

public class Rapidpay extends Baseclass {
	
	
	
	public String companyname=randomestring();
	public String vendorname=randomestring();
	public String taxno="19303033121";
	public String Addressline1="100 address";
	public String Addressline2="";
	public String Addressline3="";
	public String Addressline4="";
	public String Addressline5="";
	public String zipcode="50005";
	public String cardno="4622943120000030";
	public String nameoncard="Ronaldo";
	
	@Test
	public void Rapid() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		LoginTest lp = new LoginTest();
		lp.login();
	

		driver.findElement(By.xpath("//p[contains(text(),'View, update and manage your vendors')]")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Add Vendor')]")).click();
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys(companyname);
		driver.findElement(By.xpath("//input[@name='vendorName']")).sendKeys(vendorname);
		driver.findElement(By.xpath("//input[@name='taxNo']")).sendKeys(taxno);
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
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Ajo')]")).click();
		
//		
//		Actions action = new Actions(driver);    
//		WebElement optionsList = driver.findElement(By.xpath("//input[@name='cityId']"));
//		action.moveToElement(optionsList);

		List<WebElement> options = driver.findElements(By.xpath("//div//input[@name='cityId']"));
		for(WebElement option : options) {
		    if (option.getText().equals("Ajo")) {
		        option.click();
		    }
		}
		
//		List<WebElement> allOptions = driver.findElements(By.tagName("//div"));
//        System.out.println(allOptions.size());
//         
//                 
//                 
//        for(int i = 0; i<=allOptions.size()-1; i++) {
//             
//             
//            if(allOptions.get(i).getText().contains("Ajo")) {
//                 
//                allOptions.get(i).click();
//                break;
//                 
//            }
//        }

driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys(zipcode);
driver.findElement(By.name("emailAddress")).sendKeys("testrapidvemdor@getnada.com");
Select paymentmethod = new Select(driver.findElement(By.name("paymentMode")));
paymentmethod.selectByVisibleText("Fintainium Rapid Pay ");
Thread.sleep(5000);
driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();

driver.findElement(By.xpath("//input[@name='cardNumber']")).sendKeys(cardno);
driver.findElement(By.xpath("//input[@name='nameOnCard']")).sendKeys(nameoncard);
WebElement element=driver.findElement(By.xpath("//select[@name='expiryMonth']"));

Select month= new Select(element);
month.selectByValue("11");
WebElement expyear=driver.findElement(By.xpath("//select[@name='expiryYear']"));

Select year= new Select(expyear);
year.selectByValue("2022");
driver.findElement(By.xpath("//input[@name='cvv']")).sendKeys("145");
driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();



	}





	}


