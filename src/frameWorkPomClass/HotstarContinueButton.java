package frameWorkPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotstarContinueButton {

	@FindBy(id = "phoneNo")private WebElement MobNo;
	@FindBy(xpath = "//button[text()='Continue']")private WebElement Continue;
	
	public HotstarContinueButton(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void typeMobno()
	{
		MobNo.sendKeys("9923633748");
	}
	public void ClickContinue()
	{
		Continue.click();
	}
}
