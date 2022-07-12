package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		// how to send keys using Actions class
		
		//1.Find Element
		WebElement textbox = driver.findElement(By.id("autocomplete"));
		//textBox.sendKeys(args)--> this is WebElement method
		
		
		//2. create object of Actions Class
		Actions act=new Actions(driver);
		
		//3.take action
		act.sendKeys(textbox, "Welcome").perform();
		
		//=========================================//
		//keyBoard action up-down keys
		WebElement listbox = driver.findElement(By.name("dropdown-class-example"));
		
		act.click(listbox).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
	}

}
