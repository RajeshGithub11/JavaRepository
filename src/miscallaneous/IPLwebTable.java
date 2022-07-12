package miscallaneous;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPLwebTable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.iplt20.com/points-table/men/2022");

		// to get no of rows
		Thread.sleep(1000);
		List<WebElement> Rows = driver.findElements(By.xpath("//table//tr"));
		int TotalRows = Rows.size();      
		System.out.println("The total row is : "+TotalRows);
		
		
		//to get no of columns
		List<WebElement> Columns = driver.findElements(By.xpath("//table//tr[1]//th"));
		int TotalColumns = Columns.size();
		System.out.println("The Total Column is "+TotalColumns);
		
		System.out.println("=====================");
		
		//to get row data
		Iterator<WebElement> ite = Rows.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next().getText()+" ");
			System.out.println();
		}
		
		System.out.println("=======================");
		
		for(int i=0;i<=Columns.size()-1;i++)
		{
			System.out.println((Columns.get(i).getText()+" "));
			System.out.println();
		}
		
		
	}

}
