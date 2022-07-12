package frameWorkPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogIn 
{
	//1.Data Members
	@FindBy(id="userid") private WebElement UserName;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath ="//button[@type='submit']")private WebElement logInButton;
	
	//2.Constructor
	public KiteLogIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);  //early initialization
		
	}  
	
	//3.Methods
	public void SendUsername()
	{
		UserName.sendKeys("ELR321");
	}
	
	public void SendPassword()
	{
		password.sendKeys("Dhana1111");
	}
	public void ClickOnlogin()
	{
		logInButton.click();
	}
}
