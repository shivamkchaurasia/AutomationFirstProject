package utills;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static WebDriver driver;

	// Launch the Chrome browser

	@SuppressWarnings("deprecation")


	public static void launchchrome(String url)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SChauraisa\\Music\\Automation_Projects\\DemoBlaze\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get(url);
	}

	// Close the application

	public static void closeApp()
	{ 
		driver.close();

	}

	public static void refreshApp() 
	{
		driver.navigate().refresh();

	}

}
