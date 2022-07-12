package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
		String facebook = driver.findElement(By.xpath("//div[text()='Log in to Facebook']")).getText();
		System.out.println(facebook);
		
		
	}

}
