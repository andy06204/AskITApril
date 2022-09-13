package users;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjects.Accountingpage;
import pageobjects.Adduserpage;
import pageobjects.Loginpage;
import selenium.Baseclass;
import selenium.LoginTest;

public class Adduser extends Baseclass {
	public String firstname="Jamesona";
	public String lastname="Andersona";
	public String email="jama001@getnada.com";
	public String phoneno="1234569870";
	public String job="QA";
	public String dept="IT";
	
	@Test
	public void Addduser() throws InterruptedException, IOException {
		LoginTest lp = new LoginTest();
		lp.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Adduserpage lp1=PageFactory.initElements(driver, Adduserpage.class);
		lp1.setting();
		lp1.users();
		lp1.Adduserbtn();
		
	

		driver.findElement(By.name("firstName")).sendKeys(firstname);
		driver.findElement(By.name("lastName")).sendKeys(lastname);
		driver.findElement(By.name("emailAddress")).sendKeys(email);
		driver.findElement(By.name("phoneNumber")).sendKeys(phoneno);
		driver.findElement(By.name("jobTitle")).sendKeys(job);
		driver.findElement(By.name("department")).sendKeys(dept);
		Thread.sleep(2000);
		
		WebElement userdrpdwn = driver.findElement(By.name("roles"));
		Select objSelect = new Select(userdrpdwn);
		
		objSelect.selectByVisibleText("Approver");
		
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		
	}

}
