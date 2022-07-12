package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTypes {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//by xpath attribute
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='radio'])[1]")).click(); //-->xpath by attribute with index
		
		Thread.sleep(1000);
		driver.findElement(By.id("checkBoxOption1")).click(); //-->xpath by id locator type.
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@value='Radio3'])")).click(); //-->xpath by attribute
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[contains (text(),'Welcome')]")).getText(); //-->xpath by contains getText with object 
		
		String element = driver.findElement(By.xpath("//h1[contains (text(),'Welcome')]")).getText(); //object created
		
		System.out.println(element);
		System.out.println("the result is :- "+element);
		
		
	}

}
