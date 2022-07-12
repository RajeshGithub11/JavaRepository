package kitePOMnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userName;
	@FindBy(xpath = "//a[@target='_self']")private WebElement LogOutButton;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	public void ValidateUserName(String UserIdNew)
//	{
//		String ActualUserName = userName.getText();
//		String ExpectedUserName =UserIdNew;
//		
//		if(ActualUserName.equals(ExpectedUserName))
//		{
//			System.out.println("The username is matched test case is passed");
//		}
//		else
//		{
//			System.out.println("The username is not matched test case is failed");
//		}
//		
//	}
	
	public  String getActualUserID()
	{
		String actualUID = userName.getText();
		return actualUID;
	
	}
	
	public void Logout() throws InterruptedException 
	{
		userName.click();
		Thread.sleep(500);
		LogOutButton.click();
	}
}
