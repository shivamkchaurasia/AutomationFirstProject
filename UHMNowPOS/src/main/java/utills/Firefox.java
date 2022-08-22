package utills;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	
public static WebDriver driver;
	
	// Launch the FireFox browser

	@SuppressWarnings("deprecation")
	public static void launchFireFox(String url)
	{
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		driver = new FirefoxDriver();
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
