package actionClass;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.manage().window().getPosition());
		
		Thread.sleep(1000);
		
		// To set Position of browser, create object of Point class and pass X and Y values
		Point p=new Point(90, 80);

		// Using setPostion method we can set Position of browser
		driver.manage().window().setPosition(p);

	}

}
