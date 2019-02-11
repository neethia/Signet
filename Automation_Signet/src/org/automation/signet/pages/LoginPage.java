package org.automation.signet.pages;
import java.io.IOException;
import org.automation.signet.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	

public void enterUsername(String uname) throws IOException
{
	driver.findElement(By.name(Utility.fetchLocatorValue("login_username_name"))).sendKeys(uname);
	}
public void enterPassword(String pass) throws IOException
{
	driver.findElement(By.id(Utility.fetchLocatorValue("login_password_id"))).sendKeys(pass);
	}
public void clickSignin() throws IOException
{
	driver.findElement(By.id(Utility.fetchLocatorValue("login_signin_id"))).click();
	
	}


}
