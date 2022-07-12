package frameWorkPomClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hotStarTestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Rajesh\\Testing\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//Thread.sleep(1000);
		driver.get("https://www.hotstar.com/in");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//Thread.sleep(2000);

		HotStarLogin Firstpage=new HotStarLogin(driver);
		Firstpage.ClickLogIn();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//Thread.sleep(2000);
		HotstarContinueButton page2=new HotstarContinueButton(driver);
		page2.typeMobno();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		//Thread.sleep(4000);
		page2.ClickContinue();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//Thread.sleep(2000);
		HotstarOTP Continue2 =new HotstarOTP(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		//Thread.sleep(2000);
		Continue2.typeotp1();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//Thread.sleep(2000);
		Continue2.typeotp2();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//Thread.sleep(2000);
		Continue2.typeotp3();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		//Thread.sleep(2000);
		Continue2.typeotp4();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		//Thread.sleep(4000);
		Continue2.Clickbutton2();
	}

}
