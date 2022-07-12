package miscallaneous;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_OfLinks {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		
		Thread.sleep(1000);
		Iterator<WebElement> ite = Links.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next().getText());
		}
	}

}
