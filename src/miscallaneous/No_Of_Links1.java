package miscallaneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_Of_Links1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		System.out.println(AllLinks.size());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		for(WebElement obj:AllLinks)
		{
			System.out.println(obj.getText());
		}
	}

}
