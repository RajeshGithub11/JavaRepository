package miscallaneous;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWebTable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");

		//Step 1-->to find total no of rows
		Thread.sleep(1000);
		List<WebElement> Rows = driver.findElements(By.xpath("//table//tr"));
		int TotalRows = Rows.size();
		System.out.println("Total no. of rows is : "+TotalRows);
		
		//Step 2-->to find total no of columns
		Thread.sleep(1000);
		List<WebElement> Columns = driver.findElements(By.xpath("//table//tr[1]//th"));
		int TotalColumns = Columns.size();
		System.out.println("Total No of Column is :"+TotalColumns);
		
		System.out.println("======================");
		
		//How to read header
		for(WebElement header:Columns)
		{
			System.out.println(header.getText()+" ");
		}
		
		System.out.println("=========================");
		for(WebElement result:Rows)
		{
			System.out.println(result.getText()+" ");
			System.out.println();
		}
		
		//============OR==============//
		
//		System.out.println("========================");
//		List<WebElement> AllRowsData = driver.findElements(By.xpath("//table//tr"));
//		
//		ListIterator<WebElement> lit = AllRowsData.listIterator();
//		while(lit.hasNext())
//		{
//			System.out.println(lit.next().getText()+" ");
//			System.out.println();
//		}
	}

}
