package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(1000);
		
		//1.--> step 1. create object of Actions class and pass WebDriver object
		Actions act=new Actions(driver);
		
		//step 2.identify Element where Actions to be perform
		WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//step 3. using Actions class methods perform desired operation (Context click/RightClick)
		
		//1st method
		//act.moveToElement(rightclickbutton).perform();//move mouse to desired location.
		//act.contextClick().perform();//perform right click operation.
		
								//====OR=====//
		//2nd method
		//act.moveToElement(rightclickbutton).contextClick().build().perform();
								
								//====OR=====//
		//3rd method
		act.contextClick(rightclickbutton).perform(); 	//-->most usefull way.
		
		
		//2.--> click on webElement by using Actions class
		
		WebElement SeleniumButton = driver.findElement(By.linkText("Selenium"));
		
		//act.click(SeleniumButton).perform(); 		//-->most usefull way.
				
								//====OR=====//
		
		//act.moveToElement(SeleniumButton).click().build().perform();
		
		
		//3.-->double click using Actions class.
		
		WebElement doubleclickbutton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.doubleClick(doubleclickbutton).perform();   //-->most usefull way.
	}

}
