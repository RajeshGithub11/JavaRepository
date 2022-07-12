package miscallaneous;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_Of_Images1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(1000);
		List<WebElement> AllImages = driver.findElements(By.tagName("img"));
		System.out.println(AllImages.size());
		
//		Iterator<WebElement> ite = AllImages.iterator();
//		while(ite.hasNext())
//		{
//			System.out.println(ite.next().getText());
//		}
		
		for(int i=0;i<=AllImages.size()-1;i++)
		{
			System.out.println(AllImages.get(i).getText());
		}
	}

}
