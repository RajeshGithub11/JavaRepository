package actionClass;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.manage().window().getSize());
		
//		Thread.sleep(1000);
//		
//		// To set Size, create object of Dimension Class and pass width and Height values.
//		
//		Dimension d=new Dimension(400, 700);
//		
//		// using SetSize method we can set size of browser window.
//		driver.manage().window().setSize(d);
		
	}

}
