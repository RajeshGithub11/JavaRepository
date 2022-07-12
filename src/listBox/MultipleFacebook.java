package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleFacebook {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.name("birthday_day"));
		
		Thread.sleep(5000);
		WebElement R1 = driver.findElement(By.name("birthday_day"));
		
		Thread.sleep(5000);
		Select s = new Select(R1);
		
		Thread.sleep(5000);
		System.out.println(s.isMultiple());
		
		Thread.sleep(5000);  
		for(int i=9;i<=26;i++)
		{
			//Thread.sleep(100);
			s.selectByIndex(i);
		}
		for(int i=26;i>=9;i--)
		{
			s.selectByIndex(i);
		}
	}

}
