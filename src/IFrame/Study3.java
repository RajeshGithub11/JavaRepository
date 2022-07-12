package IFrame;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		
		//switch focus from main to frame by using
		//1.name or Id
		//2.Index
		//3.Webelement
		driver.switchTo().frame("frm2");
		
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("Rajesh");
		
		
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Contact'])[2]")).click();
		
	}

}
