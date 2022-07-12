package kitePOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
		//1.Data Members
		@FindBy(id="userid") private WebElement UserName;
		@FindBy(id="password") private WebElement password;
		@FindBy(xpath ="//button[@type='submit']")private WebElement logInButton;
		
		//2.Constructor
		public KiteLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		public void SendUsername(String UsernameNew)
		{
			UserName.sendKeys(UsernameNew);
		}
		
		public void SendPassword(String PasswordNew)
		{
			password.sendKeys(PasswordNew);
		}
		public void ClickOnlogin()
		{
			logInButton.click();
		}
}
