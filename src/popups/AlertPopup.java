 package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts ");
		
		Thread.sleep(1000);
		driver.findElement(By.id("alertButton")).click();
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(1000);
		System.out.println("the text is :- "+alt.getText());
		
		Thread.sleep(1000);

		alt.accept();
	}

}
