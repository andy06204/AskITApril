package aworkflow;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjects.Loginpage;
import selenium.Baseclass;

public class Tc_003 extends Baseclass
{
	public String username="newrev1@getnada.com";
	public String password="Password@14";
	public String workflowname="Testworkflow";
	public String billno="23";
	
	@Test
	public void workflowtest3() throws InterruptedException, IOException {
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
		driver.findElement(By.xpath("//span[contains(text(),'"+billno+"')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
		
		Select workflow=new Select(driver.findElement(By.name("workflowList")));
		workflow.selectByVisibleText(workflowname);
		driver.findElement(By.xpath("//button[contains(text(),'Apply Workflow')]")).click();
		logger.info("workflow applied");
		driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(@class,'close')]")).click();
	}

}
