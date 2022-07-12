package miscallaneous;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_Of_Images {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//Step1-->search on web and click on it
		driver.findElement(By.name("q")).sendKeys("Indian Flag");
		
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();   //findElement-->identify the single webelements
		
		//Step2-->Click On images 
		Thread.sleep(1000);
		driver.findElement(By.linkText("Images")).click();  //-->Images is a link thats why we used Linktext.
		
		//Step3-->Using findElements method and Attribute of images in tagname locator 
		Thread.sleep(1000);
		List<WebElement> Images = driver.findElements(By.tagName("img"));   //findElements-->identify the list of webelements
		
		System.out.println(Images.size());   //-->
		
		//Step 4-->print all the identify elements.
		Thread.sleep(1000);
		Iterator<WebElement> ite = Images.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next().getText());
		}
	}

}
