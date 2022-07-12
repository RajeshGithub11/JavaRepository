package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Study {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		
		//xpath by text 
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[text()='Cart']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[text()='Travel']")).click(); //---> if shows exception then we have to increase thread time.
		
		driver.get("https://seller.flipkart.com/sell-online/?utm_source=fkwebsite&utm_medium=websitedirect");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Sign')]")).getText();
		
		String flipkart = driver.findElement(By.xpath("//div[contains(text(),'Sign')]")).getText();
		System.out.println(flipkart);
		
		//xpath by attribute 
		driver.findElement(By.xpath("//div[@class='styles__RegisterText-r412un-24 sILEL']")).click(); //--> its clickable.
		
		
	}

}
