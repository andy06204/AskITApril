package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Adduserpage {

	public WebDriver driver;


	public Adduserpage(WebDriver driver)
	{
		this.driver=driver;

	}
	
	public void setting()
	{
		driver.findElement(By.xpath("//a[@href='#/dashboard/administrator/settings']//img[@class='homelefticon']")).click();
	}
	public void users()
	{
		driver.findElement(By.xpath("//a[normalize-space()='Users']")).click();
	}
	public void Adduserbtn()
	{
		driver.findElement(By.xpath("//button[contains(text(),'Add User')]")).click();
	}
	public void name(String aname)
	{
		driver.findElement(By.name("name")).sendKeys(aname);;
	}
	public void number(String num)
	{
		driver.findElement(By.name("accountNumber")).sendKeys(num);
	}
	public void submit()
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	

}
