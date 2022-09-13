package selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Datepicker extends Baseclass {
	//public static WebDriver driver;
@Test
public static String[] getmonthyear(String monthyearval) {
	
	return monthyearval.split(" ");
	
}

public void selectdate(String exday,String exmonth,String exyear) throws InterruptedException {
	WebElement date=driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']"));
	
	String monthyearval= date.getText();
	System.out.println(monthyearval);
	
	
//	while (!(getmonthyear(monthyearval)[0].equals(exmonth) && getmonthyear(monthyearval)[1].equals(exyear))) {
//		
//		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']")).click();
//		monthyearval= date.getText();
//		continue;
//
//		
//	}
	while (!(getmonthyear(monthyearval)[0].equals(exmonth) && getmonthyear(monthyearval)[1].equals(exyear))) {
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__prev-button']")).click();
		monthyearval= date.getText();
		
		
	}
	driver.findElement(By.xpath("//abbr[text()='"+exday+"']")).click();
	
	
	}


}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


