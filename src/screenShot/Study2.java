package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Study2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		//Screenshot 2
		WebDriver Rajesh=new ChromeDriver();
				
		Rajesh.get("https://www.amazon.in/");
				
		Thread.sleep(3000);
		File R = ((TakesScreenshot)Rajesh).getScreenshotAs(OutputType.FILE);  //-->Step1 (Take a screen shot)
				
		String str=RandomString.make(3);                    //-->object create for random String
		File Local=new File("E:\\Rajesh\\Screenshot\\MyScreenshot"+str+".png"); //-->Step 2 (Destination path)
				
		org.openqa.selenium.io.FileHandler.copy(R, Local);  //-->(Store a scr)

	}

}
