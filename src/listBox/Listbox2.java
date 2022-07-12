package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://www.21kschool.com/indian-landing-page/?utm_sourcel");
		
		Thread.sleep(1000);
		//step-1-inspect element
		WebElement Listbox = driver.findElement(By.xpath("//select[@name='Dropdown1']"));
		Listbox.click();
		
		//step-2 using select class 
		Select ss = new Select(Listbox);
		ss.selectByIndex(3);
		
		Thread.sleep(1000);
		WebElement Listbox1 = driver.findElement(By.xpath("//select[@name='Dropdown']"));
		Listbox1.click();
		Select ss1 = new Select(Listbox1);
		ss1.selectByValue("Grade 4");
		
		Thread.sleep(1000);
		WebElement Listbox2 = driver.findElement(By.xpath("//select[@name='Dropdown2']"));
		Listbox2.click();
		
		Select ss2=new Select(Listbox2);
		ss2.selectByVisibleText("India");
		
		Thread.sleep(1000);
		WebElement Listbox3 = driver.findElement(By.id("statedefault"));
		Listbox3.click();
		Select ss3=new Select(Listbox3);
		ss3.selectByVisibleText("Arunachal Pradesh");
		
		Thread.sleep(1000);
		WebElement Listbox4 = driver.findElement(By.id("citydefault"));
		Listbox4.click();
		Select ss4=new Select(Listbox4);
		ss4.selectByIndex(1);
		
	}

}
