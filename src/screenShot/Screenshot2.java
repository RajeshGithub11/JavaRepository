package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot2 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.iplt20.com/");
		
		//step-1
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//step-2
		
		 String strr = RandomString.make(3);
		
		File destination = new File("E:\\Rajesh\\Screenshot\\ipl"+strr+".png ");
		
		//step -3
		FileHandler.copy(scr, destination);
	}

}
