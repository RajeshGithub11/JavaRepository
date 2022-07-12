package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1stSeleniumcode {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.cricbuzz.com/");
		
		//we have to call one element at one time only.
		//bcz  compiler get confuse for calling.
		//driver.findElement(By.xpath("//a[text()='Schedule']")).click();
		
		
		
		driver.get("https://vctcpune.com/");
		
		//xpath by attribute
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[@href='https://vctcpune.com/courses/']")).click();
		
		//xpath by text
		//driver.findElement(By.xpath("//Strong[text()='Our Mission']")); 
		
		//driver.findElement(By.xpath("//strong[text()='Our Mission']"));
		
		
		//driver.get("https://www.facebook.com/");
		
		//contains with text
		//driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]"));
		//String result = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]")).getText();
		//System.out.println(result);
		
		
		//contains with attribute
		//driver.findElement(By.xpath("//input[contains(@type,'text')]"));
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//p[contains(text(),'To build')]"));
		Thread.sleep(5000);
		String R1 = driver.findElement(By.xpath("//p[contains(text(),'To build')]")).getText();//-->not clickable.
		System.out.println(R1);
	}

}
