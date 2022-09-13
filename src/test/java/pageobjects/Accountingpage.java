package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accountingpage {

	WebDriver driver;


	public Accountingpage(WebDriver driver)
	{
		this.driver=driver;

	}
//	WebElement settings=driver.findElement(By.xpath("//a[@href='#/dashboard/administrator/settings']//img[@class='homelefticon']"));
//
//	WebElement Accounting=driver.findElement(By.xpath("//a[normalize-space()='Accounting']"));
//	WebElement New=driver.findElement(By.xpath("//button[normalize-space()='New']"));
//	WebElement name=driver.findElement(By.name("name"));
//	WebElement number=driver.findElement(By.name("accountNumber"));
//	WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
	public void setting()
	{
		driver.findElement(By.xpath("//a[@href='#/dashboard/administrator/settings']//img[@class='homelefticon']")).click();
	}
	public void Accounting()
	{
		driver.findElement(By.xpath("//a[normalize-space()='Accounting']")).click();
	}
	public void New()
	{
		driver.findElement(By.xpath("//button[normalize-space()='New']")).click();
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
