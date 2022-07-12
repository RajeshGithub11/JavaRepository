package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");

		Thread.sleep(2000);
		
		//1.find source and destination Elements
		
		WebElement sourceElement = driver.findElement(By.id("drag1"));
		
		WebElement DestinationElement = driver.findElement(By.id("div2"));
		
		//2.Create object of Actions Class and pass driver
		
		Thread.sleep(5000);
		Actions act =new Actions(driver);
		
		//3. using cascaded methods
		
		//act.moveToElement(sourceElement).clickAndHold().moveToElement(DestinationElement).release().build().perform();
		
		Thread.sleep(5000);
		act.dragAndDrop(sourceElement, DestinationElement).perform();

	}

}
