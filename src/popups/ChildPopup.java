package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Step 1
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");

		//Step 2
		Thread.sleep(100);
		String MainPageID = driver.getWindowHandle();  //ID of main Page.
		System.out.println(MainPageID);
		
		System.out.println("==============================");
		
		//To open a child window
		driver.manage().window().maximize();//--> maximize hot nhi
		driver.findElement(By.name("NewWindow")).click();
		
		Thread.sleep(1000);
		
		//step 3
		//to handle multiple windows //to get multiple ID's
		
		Set<String> AllPageID = driver.getWindowHandles(); //ID of main page & Child page
		
		Iterator<String> ite = AllPageID.iterator();
//		while(ite.hasNext())
//		{
//			System.out.println(ite.next());
//		}
		
		String mainpageid = ite.next();
		String childpageid = ite.next();
		
		System.out.println(mainpageid);
		System.out.println(childpageid);
		
		//Step 4
		//to switch focus to child window
		driver.switchTo().window(childpageid); //changing focus from main page to child page.
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElement(By.id("the7-search")).sendKeys("This is Child Browser");
		
		Thread.sleep(1000);
		//driver.close();
		//driver.quit();
		
		driver.switchTo().window(mainpageid);
		
		//WebElement myElement = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
		
		//System.out.println(myElement.getText());
	
	}

}
