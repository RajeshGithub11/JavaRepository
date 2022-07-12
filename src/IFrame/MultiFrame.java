package IFrame;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class MultiFrame {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

		Thread.sleep(1000);
		WebElement obj = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		
		driver.switchTo().frame(obj);  // webelement is used as argument.
		
		Thread.sleep(1000);
		WebElement obj1 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		
		Thread.sleep(1000);
		driver.switchTo().frame(obj1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9923633748");
		
		//To take Screen shot
		Thread.sleep(1000);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String str = RandomString.make(3);
		File destination = new File("E:\\Rajesh\\Screenshot\\Multiframe"+str+".png");
		
		org.openqa.selenium.io.FileHandler.copy(source, destination);
		
	}

}
