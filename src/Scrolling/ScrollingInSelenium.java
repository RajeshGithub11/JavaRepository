package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInSelenium {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");

		JavascriptExecutor je=(JavascriptExecutor)driver;
		//je.executeScript("window.scrollBy(90,799)");   //-->Normal Scrolling
		
		WebElement obj = driver.findElement(By.xpath("//legend[text()='iFrame Example']"));
		
		je.executeScript("arguments[0].scrollIntoView(true)",obj);  //-->ScrollIntoView
	}

}
