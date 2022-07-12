package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		Thread.sleep(1000);
		Select s=new Select(dropdown);
		System.out.println(s.isMultiple());
		
		s.selectByIndex(3);
		Thread.sleep(1000);
		s.selectByValue("saab");
		Thread.sleep(1000);
		s.selectByVisibleText("Opel");
		Thread.sleep(1000);
		s.deselectAll();
		Thread.sleep(1000);
		s.deselectByIndex(3);
		Thread.sleep(1000);
		s.deselectByValue("saab");
		Thread.sleep(1000);
		s.deselectByVisibleText("Opel");
		
		
		
	}

}
