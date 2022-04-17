package selenium;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Adduser extends Baseclass {
	
	@Test
	public void Addduser() throws InterruptedException, IOException {
		LoginTest lp = new LoginTest();
		lp.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='#/dashboard/administrator/settings']//img[@class='homelefticon']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Users']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add User']")).click();
		driver.findElement(By.name("firstName")).sendKeys("Testnameuser");
		driver.findElement(By.name("lastName")).sendKeys("Testlnameuser");
		driver.findElement(By.name("emailAddress")).sendKeys("Testuser09@getnada.com");
		driver.findElement(By.name("phoneNumber")).sendKeys("5545567912");
		driver.findElement(By.name("jobTitle")).sendKeys("Testuser");
		driver.findElement(By.name("department")).sendKeys("Testdept");
		Thread.sleep(2000);
		
		WebElement userdrpdwn = driver.findElement(By.name("roles"));
		Select objSelect = new Select(userdrpdwn);
		
		objSelect.selectByVisibleText("Approver");
		
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		
	}

}
