package frameworkExcelPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 
{

		@FindBy(id = "pin")private WebElement PIN;
		@FindBy(xpath = "//button[@type='submit']") private WebElement Continuebutton;

		public KitePinPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void PINPage(String PinNew)
		{
			PIN.sendKeys(PinNew);
		}
		public void ClickOnContinueButton()
		{
			Continuebutton.click();
		}
}
