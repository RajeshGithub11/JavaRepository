package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.facebook.com/");
		//driver.get("https://vctcpune.com/");  
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		//Thread.sleep(1000);
		//driver.manage().window().minimize();
		
		Thread.sleep(500);
		driver.navigate().to("https://www.amazon.in/");
		//Thread.sleep(500);
		//driver.navigate().back();
		//Thread.sleep(500);
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		//Thread.sleep(500);
		//driver.close();
		
		Thread.sleep(500);
		System.out.println(driver.getTitle());
		
		
		//=======OR -BY USING REFRANCE VARIABLE========//
		
		Thread.sleep(500);
		System.out.println(driver.getCurrentUrl());
	}

}
