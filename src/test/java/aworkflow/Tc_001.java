package aworkflow;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjects.Loginpage;
import selenium.Baseclass;


public class Tc_001 extends Baseclass {
	
	public String username="newrev1@getnada.com";
	public String password="Password@14";
	public String workflowname="workflow10";
	public String approver="Ak kumar";
	public String payor="bobby bro";
@Test
public void workflowtest1() throws InterruptedException, IOException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	logger.info("Entered Url");
	
	driver.get(url);
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
	lp.btn_click();
	
	lp.login_fintainium(username, password);
	lp.btn_click1();

	driver.findElement(By.xpath("//a[@href='#/dashboard/administrator/settings']//img[@class='homelefticon']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Workflow']")).click();
	driver.findElement(By.name("workflowname")).sendKeys(workflowname);
	Select apprvr=new Select(driver.findElement(By.name("workflowusers.0.userid")));
	apprvr.selectByVisibleText(approver);
	Select payorr=new Select(driver.findElement(By.name("payorid")));
	payorr.selectByVisibleText(payor);
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	logger.info("default workflow created");
	

}
}
