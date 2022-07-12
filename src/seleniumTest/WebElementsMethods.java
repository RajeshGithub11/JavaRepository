package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		
		//1. .sendkeys()
		Thread.sleep(10000);
		driver.findElement(By.id("searchInput")).sendKeys("Rajesh");
		
		
		//2. .clear()
		//Thread.sleep(10000);
		//driver.findElement(By.id("searchInput")).clear();
		
		//driver.get("https://vctcpune.com/selenium/practice.html");
		
		//3.  .click()
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//input[@value='Radio2']")).click();
		
		//Last four web elements method need create object.
		//4.  .getText()
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
		//String Ra = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
		//System.out.println(Ra);
		
		//5.  .isEnabled()
		//Thread.sleep(10000);
		//driver.findElement(By.id("checkBoxOption1"));
		//boolean R1 = driver.findElement(By.id("checkBoxOption1")).isEnabled();
		//System.out.println(R1);
		
		//6.  .isSelected()
		//Thread.sleep(5000);
		//driver.findElement(By.id("checkBoxOption1")).click();
		//driver.findElement(By.id("checkBoxOption1"));
		//boolean R2 = driver.findElement(By.id("checkBoxOption1")).isSelected();
		//System.out.println(R2);
		
		//Thread.sleep(5000);
		//driver.findElement(By.id("checkBoxOption1"));
		//boolean R3 = driver.findElement(By.id("checkBoxOption1")).isDisplayed();
		//System.out.println(R3);
		
		/*Thread.sleep(5000);
		WebElement M1 = driver.findElement(By.id("hide-textbox")); 
		boolean result1 = driver.findElement(By.id("hide-textbox")).isDisplayed();
		System.out.println(result1);
		
		if(M1.isDisplayed())
		{
			System.out.println("Textbox is diplayed");
		}
		else
		{
			System.out.println("textbox is not displayed");
		}
		*/
		
		
		
	}

}
