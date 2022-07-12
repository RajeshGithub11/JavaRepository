package IFrame;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver Rajesh=new ChromeDriver();
		
		Rajesh.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//we can switch to frame by three ways
		Thread.sleep(1000);
		//Rajesh.switchTo().frame("iframeResult");   //1. Name or ID
		//Rajesh.switchTo().frame(1);                //2. Index
		WebElement test = Rajesh.findElement(By.xpath("//button[@type='button']"));
		Rajesh.switchTo().frame(test);               //3. WebElement  --->This method is not clear
		
		
		//Thread.sleep(1000);
		//WebElement test = Rajesh.findElement(By.xpath("//button[@type='button']"));
		test.click();
		
		//switch focus from frame to main page
		Rajesh.switchTo().parentFrame();  //1.parent=child frame ti immediate child.
		Thread.sleep(1000);
		Rajesh.findElement(By.xpath("//a[@title='Change Theme'][1]")).click();
		
		Thread.sleep(1000);
		Rajesh.switchTo().defaultContent();
		
		

	}

}
