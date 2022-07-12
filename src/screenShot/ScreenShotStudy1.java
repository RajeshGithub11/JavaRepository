package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class ScreenShotStudy1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		
		Thread.sleep(5000);
		
		// ((TakesScreenshot)driver)-->to take ss type cast driver object to TakesScreenshot interface.
		// getscreenshotAs()--> this is call function, need to pass the argument.
		//Outputtype.FILE
		
		//-->below statement takes screenshot in inside temporary memory.
		
		//step 1
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //-->temporary memory.
		System.out.println(screenShot);  //--> to take the location of currenrt ss.  
		
		//-->to store ss in local drive we need to call a method.
		//step 2
		File dest=new File("E:\\Rajesh\\Screenshot\\MyScreenshot.png");
		
		//step 3
		org.openqa.selenium.io.FileHandler.copy(screenShot, dest);
		
		
//		//Screenshot 2
//		WebDriver Rajesh=new ChromeDriver();
//		
//		Rajesh.get("https://www.discoveryplus.in/");
//		
//		Thread.sleep(3000);
//		 File R = ((TakesScreenshot)Rajesh).getScreenshotAs(OutputType.FILE);
//		
//		String str=RandomString.make(3);
//		File Local=new File("E:\\Rajesh\\Screenshot\\MyScreenshot"+str+".png");
//		
//		org.openqa.selenium.io.FileHandler.copy(R, Local);
//		
		
	}

}
