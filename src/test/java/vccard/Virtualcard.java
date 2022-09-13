package vccard;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import selenium.Baseclass;
import selenium.LoginTest;

public class Virtualcard extends Baseclass{
	public String name="Arun";
	public String year="2023";
	@Test
	public void vccard() throws InterruptedException, IOException {
		
		
		LoginTest lp = new LoginTest();
		lp.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='#/dashboard/cards']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Create Card')]")).click();
		driver.findElement(By.name("cardName")).sendKeys(name);
		
		Select obj= new Select(driver.findElement(By.name("fundingSource")));
		
		obj.selectByIndex(1);
		WebElement singleuse=driver.findElement(By.xpath("//input[@type='radio'] [1]"));
		WebElement reuse=driver.findElement(By.xpath("//input[@type='radio'] [2]"));
		singleuse.click();
		driver.findElement(By.name("spendLimit")).sendKeys("100.00");
		Select obj1= new Select(driver.findElement(By.name("expiryMonth")));
		
		obj1.selectByIndex(1);
		
		Select obj2= new Select(driver.findElement(By.name("expiryYear")));
		
		obj2.selectByVisibleText(year);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

		WebElement Card=driver.findElement(By.xpath("//h5[contains(text(),'Card created successfully')]"));
		
		if (Card.getText().equalsIgnoreCase("Card created successfully")) {
			
			Assert.assertTrue(true);
			
		}
		
		
		
		
	}

}
