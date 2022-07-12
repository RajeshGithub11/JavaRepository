package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		Thread.sleep(2000);
		
		//1.find source and destination Elements
		
		WebElement sourceElement = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement DestinationElement = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[5]"));
		
		//2.Create object of Actions Class and pass driver
		
		Actions act =new Actions(driver);
		
		//3. using cascaded methods
		
		//act.moveToElement(sourceElement).clickAndHold().moveToElement(DestinationElement).release().build().perform();
		
		act.dragAndDrop(sourceElement, DestinationElement).perform();
	}

}
