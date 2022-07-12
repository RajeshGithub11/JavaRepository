package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FbActions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(1000);
		
		
		WebElement day = driver.findElement(By.id("day"));
		
		Actions act =new Actions(driver);
		
		act.click(day).perform();
		for(int i=1;i<=5;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		
		act.keyDown(firstname, Keys.SHIFT).sendKeys("R").keyUp(firstname, Keys.SHIFT).sendKeys(Keys.ARROW_RIGHT).sendKeys("ajesh").build().perform();
		
	}

}
