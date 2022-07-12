package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		
		 //WebDriverWait Wait = new WebDriverWait(driver, Duration.ofMillis(1000));
		WebElement review = driver.findElement(By.xpath("(//a[text()='Student Review'])[1]"));
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(20)); //it is used for only single element.
		
		w.until(ExpectedConditions.visibilityOf(review));
		
		review.click();
	}
}
