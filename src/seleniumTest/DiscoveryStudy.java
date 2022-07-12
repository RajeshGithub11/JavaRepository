package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiscoveryStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//1.driver.get use
		//driver.get("https://www.discoveryplus.in/");
		
		//2.driver.close()  3.driver.quit()
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		//4.driver.maximize()  driver.minimize()
		//Thread.sleep(1000);
		//driver.manage().window().maximize();
		//Thread.sleep(1000);
		//driver.manage().window().minimize();
		
		//5. navigate()
		
		driver.get("https://vctcpune.com/");
		//Thread.sleep(1000);
		//driver.navigate().to("https://www.google.com/");
		//Thread.sleep(1000);
		//driver.navigate().back();
		//Thread.sleep(1000);
		//driver.navigate().forward();
		//Thread.sleep(1000);
		//driver.navigate().refresh();
		
		//6.getTitle()
		
		//Thread.sleep(1000);
		System.out.println(driver.getTitle());
		
		//Thread.sleep(1000);
		//String title = driver.getTitle();
		//System.out.println("the title is "+title);
		//System.out.println("=================");
		
		//7.getCurrentURL()
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		
		//Thread.sleep(1000);
		//String url = driver.getCurrentUrl();
		//System.out.println("the current url is "+url);
		
		
	}

}
