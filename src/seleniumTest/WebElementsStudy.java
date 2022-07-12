package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// web driver method 1
		driver.get("https://www.discoveryplus.in/");
		
		// web driver method 2&3-->driver.close(); & driver.quit();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click(); //-->web element method 3
		
		Thread.sleep(5000);
		WebElement OTPbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		boolean test1 = OTPbutton.isEnabled(); 
		System.out.println("The result is "+test1);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9923633748");  //-->web element method 1
		
		Thread.sleep(5000);
		boolean test2 = OTPbutton.isEnabled();
		System.out.println("The result is "+test2);
		
		if(OTPbutton.isEnabled())    //--> or if(test2==true)--> asi pn condition chalate.
		{
			System.out.println("the button is enabled");
		}
		else
		{
			System.out.println("not enabled");
		}
		
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
		
		
		
	}

}
