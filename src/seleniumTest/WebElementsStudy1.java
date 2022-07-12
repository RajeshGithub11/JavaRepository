package seleniumTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsStudy1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Rajesh\\\\Testing\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.discoveryplus.in/");
		
		//Driver.manage().window().maximize();
		Thread.sleep(5000);
		//Driver.findElement(By.id("searchInput")).sendKeys("Rajesh");
		
		Driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(2000);
		//Driver.findElement(By.id("mobileNumber")).sendKeys("9923633748");
		
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//button[@type='submit']"));
		WebElement OTP = Driver.findElement(By.xpath("//button[@type='submit']"));
		OTP.isEnabled();
		System.out.println(OTP.isEnabled());
		
		System.out.println(OTP.isDisplayed());
		
		System.out.println(OTP.isSelected());
		
		if(OTP.isEnabled())
		{
			System.out.println("The button is enabled");
		}
		else
		{
			System.out.println("The button is not enabled");
		}
	}

}
