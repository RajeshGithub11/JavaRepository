package miscallaneous;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_Of_Listbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("instagram");
		
		Thread.sleep(1000);
		 List<WebElement> result = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(result.size());
		
		ListIterator<WebElement> lit = result.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next().getText());
		}
	}

}
