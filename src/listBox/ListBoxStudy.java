 package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.findElement(By.name("dropdown-class-example"));
		WebElement listbox = driver.findElement(By.name("dropdown-class-example"));
		Select s=new Select(listbox);
	
		
//		Thread.sleep(5000);
//		s.selectByVisibleText("Option2");
		
//		Thread.sleep(5000);
//		s.selectByIndex(3);
		
		Thread.sleep(5000);
		s.selectByValue("option1");
		
		
		//Example 2 
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(1000);
		WebElement R1 = driver.findElement(By.id("day"));
		WebElement R2 = driver.findElement(By.id("month"));
		WebElement R3 = driver.findElement(By.name("birthday_year"));
		
		Thread.sleep(1000);
		Select D1=new Select(R1);
		Select D2=new Select(R2);
		Select D3=new Select(R3);
		
		Thread.sleep(1000);
		D1.selectByIndex(12);
		Thread.sleep(1000);
		D2.selectByValue("1");
		Thread.sleep(1000);
		D3.selectByVisibleText("1997");
		
		
		
	}

}
