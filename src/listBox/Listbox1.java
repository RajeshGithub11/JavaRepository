package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");	
		
		Thread.sleep(500);
		WebElement listbox = driver.findElement(By.id("oldSelectMenu"));
		
		listbox.click();
		
		Thread.sleep(1000);
		Select sss = new Select(listbox);
		//sss.selectByIndex(2);
		//Thread.sleep(500);
		//sss.selectByValue("6");
		Thread.sleep(500);
		sss.selectByVisibleText("Black");
		
		
	}

}
