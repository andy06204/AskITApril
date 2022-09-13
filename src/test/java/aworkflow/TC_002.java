package aworkflow;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.Loginpage;
import selenium.Baseclass;

public class TC_002 extends Baseclass{
	public String username="newrev1@getnada.com";
	public String password="Password@14";
	
	@Test
	public void workflowtest2() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		logger.info("Entered Url");
		
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
		lp.btn_click();
		
		lp.login_fintainium(username, password);
		lp.btn_click1();
		driver.findElement(By.xpath("//a[@href='#/dashboard/accounts-payables/pending-review']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Scanned']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'check1')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'View')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();
}
}
