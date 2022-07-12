package actionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.browserstack.com/");
		
		Actions act = new Actions(driver);
		
		WebElement ClickButton = driver.findElement(By.xpath("//a[text()='Get started free']"));
		
		act.click(ClickButton).perform();
		
		//==================right click============
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
//		WebElement RightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
//		act.moveToElement(RightClick).perform();
//		act.contextClick(RightClick).perform();
		
		//================Double click================
		WebElement DoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.moveToElement(DoubleClick).doubleClick().build().perform();
		
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
	
		
	}

}
