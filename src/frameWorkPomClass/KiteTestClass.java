package frameWorkPomClass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
		KiteLogIn LogIN=new KiteLogIn(driver);
		
		LogIN.SendUsername();
		LogIN.SendPassword();
		LogIN.ClickOnlogin();
		
		//=========================//
		Thread.sleep(2000);
		
		KitePinPage pin=new KitePinPage(driver);
		pin.PINPage();
		pin.ClickOnContinueButton();

		//=========================//
		Thread.sleep(2000);
		KiteHomePage home=new KiteHomePage(driver);
		home.ValidateUserName();
		Thread.sleep(2000);
		home.ClickOnUsername();
		Thread.sleep(2000);
		home.Logout();
	}

}
