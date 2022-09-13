package vccard;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;

public class TranscationHistory extends Baseclass {
	
	
	@Test
	public void Datepicker() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LoginTest lp = new LoginTest();
		lp.login();
		driver.findElement(By.xpath("//a[@href='#/dashboard/transaction-history']")).click();
		WebElement transctionhistory = driver.findElement(By.xpath("//div[@id='payable-inner-tab-pane-outgoingPayments']//button[@type='button'][normalize-space()='Download Transaction History']"));
		transctionhistory.click();	
		driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']")).click();
		
		List<WebElement> dates=driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__month-view__days__day']"));
		System.out.println(dates.size());
		for (WebElement webElement : dates) {

            if(webElement.getText().equalsIgnoreCase("4"))

            {

                webElement.click();

            }

        }

		
//		WebElement Fromdate=driver.findElement(By.xpath("//input[@type='number']"));
//		Fromdate.sendKeys("01042021");

		Thread.sleep(3000);
		WebElement Dropdown=driver.findElement(By.xpath("//div[@class='dropdown-btn-menu']"));
		Actions actions = new Actions(driver); 
		actions.moveToElement(Dropdown);
		actions.click();
		  actions.release().perform(); 
		
		  
		
		
		

	

		WebElement csv=driver.findElement(By.xpath("//div[@class='dropdown-content']//a[1]"));
		csv.click();   
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[contains(text(),'Successfully downloaded.')]")));
				
		System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'Successfully downloaded.')]")).getText());
		}

		
	
}


