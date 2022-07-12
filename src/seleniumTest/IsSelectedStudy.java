package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Admin/Desktop/Forms/Form%20no.1.html");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Thread.sleep(10000);
		//WebElement submit = driver.findElement(By.tagName("//input[@type='submit']")); //-->result yet nhi
		//boolean result1 = submit.isSelected();
		//System.out.println("The result1 is "+result1);
		
	}

}
