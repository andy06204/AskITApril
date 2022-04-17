package selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Datepicker extends Baseclass {
	//public static WebDriver driver;
@Test
	public  void Test() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
//		WebDriverManager.chromedriver().setup();
		
		//driver=new ChromeDriver();
		
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/div[1]/button[2]")).click();
		selectdate("1","April","2020");

	}
	
	
	public static String[] getmonthyear(String monthyearval) {
		
		return monthyearval.split(" ");
		
	}
	
	public static void selectdate(String exday,String exmonth,String exyear) {
		WebElement date=driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']"));
		
		String monthyearval= date.getText();
		System.out.println(monthyearval);
		
		
		while (!(getmonthyear(monthyearval)[0].equals(exmonth) && getmonthyear(monthyearval)[1].equals(exyear))) {
			
			driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']")).click();
			monthyearval= date.getText();
			
		}
		driver.findElement(By.xpath("//abbr[text()='"+exday+"']")).click();
		
		
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
