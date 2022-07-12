package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.switchTo().frame("frame1");
		WebElement assignment = driver.findElement(By.tagName("input"));
		assignment.sendKeys("W5 group Assignment");
		
		Thread.sleep(1000);
		driver.switchTo().frame("frame3");
		
		WebElement rajesh=driver.findElement(By.xpath("//input[@type='checkbox']"));
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		System.out.println(rajesh.isEnabled());
		System.out.println(rajesh.isSelected());
		System.out.println(rajesh.isDisplayed());
		
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement test = driver.findElement(By.id("animals"));
		Select Demo = new Select(test);
		
		Demo.selectByValue("avatar");
		
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		String demo1 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(demo1);
		
		
	}

}
