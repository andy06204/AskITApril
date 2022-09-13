package adminportal;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;

public class AddbusinessTest extends AdminBaseclass {
	public String company="QAAA";
	public String Busemail="aqta@getnada.com";
	public String Bussinessnumber="198383849";
	public String address="100 york street";

	@Test
	public void updatebusinees() throws InterruptedException {
		AdminLoginTest al=new AdminLoginTest();
		al.Adminlogin();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@href='#/dashboard/business']//img[@class='homelefticon']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Add Business')]")).click();
		driver.findElement(By.xpath("(//input[contains(@name,'businessName')])[1]")).sendKeys(company);
		driver.findElement(By.xpath("//input[contains(@name,'businessEmail')]")).sendKeys(Busemail);
		driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
		Thread.sleep(5000);
		Select arp= new Select(driver.findElement(By.xpath("//select[@name='businessType']")));
		arp.selectByVisibleText("Corporation");
		driver.findElement(By.xpath("//input[@name='businessNumber']")).sendKeys(Bussinessnumber);
		driver.findElement(By.xpath("//input[@name='businessAddress1']")).sendKeys(address);
		driver.findElement(By.xpath("(//div[contains(@class,'css-tlfecz-indicatorContainer')])[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'United States')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[contains(@class,'css-tlfecz-indicatorContainer')])[3]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'California')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[contains(@class,'css-tlfecz-indicatorContainer')])[5]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Acton')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='businessZipcode']")).sendKeys("14567");
		driver.findElement(By.xpath("//input[@name='businessPhone']")).sendKeys("0987654321");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button__icon']")).click();
		driver.findElement(By.xpath("//abbr[@aria-label='August 1, 2022']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[7]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'United States')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[9]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'California')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[contains(@class,'css-tlfecz-indicatorContainer')])[11]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Acton')]")).click();
		Thread.sleep(5000);
		WebElement element1=driver.findElement(By.name("typeOfBusiness"));
		Select c=new Select(element1);
		c.selectByValue("B2B_BUSINESS_TO_BUSINESS");
		WebElement element2=driver.findElement(By.name("activityType"));
		Select d=new Select(element2);
		d.selectByVisibleText("FD (Funds Disbursement)");
		
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		
//		driver.findElement(By.xpath("(//div[contains(text(),'Search Country...')])[1]")).sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("(//div[@class='css-1g6gooi'])[2]")).sendKeys("Alaska");
//		
//		driver.findElement(By.xpath("//input[@placeholder='Type to search']")).sendKeys("Abhi");
//		driver.findElement(By.xpath("//input[@placeholder='Type to search']")).sendKeys(Keys.ENTER);
//driver.findElement(By.xpath("//td[normalize-space()='Abhi']")).click();
//
//logger.info("Slect businesstupe");
//Thread.sleep(3000);
//WebElement element=driver.findElement(By.name("businessType"));
//Select anc=new Select(element);
//anc.selectByVisibleText("Corporation");
//logger.info("taxno entered");
//driver.findElement(By.name("businessNumber")).sendKeys("1993993440040");
//logger.info("Address entered");
//driver.findElement(By.name("businessAddress1")).sendKeys("Address");
//logger.info("zipcode entered");
//driver.findElement(By.xpath("//input[@name='businessZipcode']")).sendKeys("50005");
//driver.findElement(By.xpath("//input[@name='businessPhone']")).sendKeys("9879879876");
//logger.info("phoneno entered");
//Thread.sleep(5000);
//logger.info("select type of business");
//WebElement element1=driver.findElement(By.name("typeOfBusiness"));
//Select c=new Select(element1);
//c.selectByValue("B2B_BUSINESS_TO_BUSINESS");
////Thread.sleep(5000);
//logger.info("select type of activity");
//
//WebElement element2=driver.findElement(By.name("activityType"));
//Select d=new Select(element2);
//d.selectByVisibleText("FD (Funds Disbursement)");
//Thread.sleep(3000);
//logger.info("button clicked");
//driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
//	
}
		
	}

