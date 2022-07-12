package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDiplayedStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		
		Thread.sleep(5000);
		WebElement signIn = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		boolean result1 = signIn.isDisplayed();
		System.out.println("The result1 is "+result1);
		
		Thread.sleep(10000);
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		
		//WebElement getOTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		//boolean result2 = getOTP.isDisplayed();                                     //---->not clear.
		//System.out.println("The result2 is "+result2);
		
		//Thread.sleep(20000);
		//WebElement OTPbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		//boolean result3 = OTPbutton.isSelected();                                 //---->not clear.
		//System.out.println("The result3 is "+result3);
	}

}
