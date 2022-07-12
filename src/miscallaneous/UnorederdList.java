package miscallaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorederdList {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Honda");
		
		Thread.sleep(200);
		List<WebElement> searchresults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		System.out.println(searchresults.size());
		
		for(WebElement r:searchresults)  // for getting text only
		{
			System.out.println(r.getText());
		}
		
		Thread.sleep(1000);
		for(WebElement result:searchresults)
		{
			String actualtext = result.getText();
			String expectedtext = "honda amaze";
			
			Thread.sleep(2000);
			if(actualtext.equals(expectedtext))
			{
				result.click();                     //--->not clear
				System.out.println("This is invalid");
				break;
			}
		}
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Images")).click();
		
		List<WebElement> noOfimg = driver.findElements(By.tagName("img"));
		System.out.println(noOfimg.size());   
																					
	}

}
