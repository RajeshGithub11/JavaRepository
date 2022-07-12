package frameWorkPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotstarOTP {

	@FindBy(xpath = "(//input[@type='text'])[1]")private WebElement number1;
	@FindBy(xpath = "(//input[@type='text'])[2]")private WebElement number2;
	@FindBy(xpath = "(//input[@type='text'])[3]")private WebElement number3;
	@FindBy(xpath = "(//input[@type='text'])[4]")private WebElement number4;
	@FindBy(xpath = "//span[text()='Continue']")private WebElement Button2;
	
	public HotstarOTP (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void typeotp1()
	{
		number1.sendKeys("7");
	}
	
	
	public void typeotp2()
	{
		number2.sendKeys("6");
	}
	
	public void typeotp3()
	{
		number3.sendKeys("8");
	}
	
	public void typeotp4()
	{
		number4.sendKeys("8");
	}
	public void Clickbutton2()
	{
		Button2.click();
	}
	
	
	
}
