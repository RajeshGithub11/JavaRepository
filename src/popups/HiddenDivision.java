package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Oneplus 10r");
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
	}

}
