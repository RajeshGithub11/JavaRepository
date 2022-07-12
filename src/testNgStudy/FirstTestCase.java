package testNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestCase {
  @Test
  public void MyMethod() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.iplt20.com/");
		
		Thread.sleep(1000);
		System.out.println("Hi this is printing statement");  //this statement only shown in console.
		Reporter.log("Hi this is Reporter Output");     // this statement show only in Report.
		Reporter.log("Hi this is Reporter Output true",true);  //This Statement show in console and Report.
		
  }
}
