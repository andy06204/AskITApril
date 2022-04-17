package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {


	WebDriver driver;
	

	public Loginpage(WebDriver driver)
	{
	 this.driver=driver;

	}
	
	@FindBy(xpath = "//button[@type='button']")
	WebElement btn_login;

	@FindBy(name = "emailAddress")//input[@name='emailAddress']
	WebElement username;

	@FindBy(name = "password")//input[@name='password']
	WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Login')]")//button[contains(text(),'Login')]
	WebElement btn_login1;

	



 public void btn_click()
 {
	btn_login.click();
}
public void login_fintainium(String uid,String pwd)
{

	

	username.sendKeys(uid);
	password.sendKeys(pwd);
}
public void btn_click1()
 {

	btn_login1.click();
}





	}


