package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Static.html");

		Thread.sleep(5000);
		
		WebElement Source = driver.findElement(By.id("angular"));
		
		WebElement destination = driver.findElement(By.id("droparea"));
		
		
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		act.dragAndDrop(Source, destination).perform();
		     
		        //OR//
		//act.moveToElement(Source).clickAndHold().moveToElement(destination).release().perform();
	}

}
