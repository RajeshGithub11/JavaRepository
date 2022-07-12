package frameWorkPomClass;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotStarLogin {

	//1.Data Members
	@FindBy(xpath = "//div[text()='LOGIN']")private WebElement LogIn;
	
	//2.Constructor
	public HotStarLogin(WebDriver driver)
	{
		
		PageFactory.initElements( driver, this);
	}
	
	//3.Methods
	public void ClickLogIn()
	{
		LogIn.click();
	}
	
}
