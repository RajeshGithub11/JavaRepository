package IFrame;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class IframeStudy {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//we can switch to frame by three ways.
		
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");  //name or ID
		//driver.switchTo().frame(1);                 //Index
		//driver.switchTo().frame(test);              // webelement
		
		
		Thread.sleep(1000);
		WebElement test = driver.findElement(By.xpath("//button[@type='button']"));
		test.click();
		
		//driver.switchTo().parentFrame();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[@title='Change Theme'][1]")).click();
		
		/*
		Thread.sleep(1000);
		File result = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\Rajesh\\Screenshot\\MyMock.png");
		FileHandler.copy(result, destination);
		*/
	}

}
