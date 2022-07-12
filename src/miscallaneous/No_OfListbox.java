package miscallaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_OfListbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Honda");
		
		Thread.sleep(1000);
		List<WebElement> result =driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		System.out.println(result.size());
		
		for(WebElement test:result)
		{
			System.out.println(test.getText());
		}
	}

}
