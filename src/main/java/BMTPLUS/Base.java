package BMTPLUS;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
public static WebDriver driver;
	
	public WebDriver InitialiseDriver() throws IOException, InterruptedException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Majji Durgaprasad\\eclipse-workspace2\\BMTPLUS\\src\\main\\java\\BMTPLUS\\config.properties");
		prop.load(fis);
		String BrowserName = prop.getProperty("browser");
		
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Majji Durgaprasad\\eclipse-workspace2\\BMTPLUS\\libs\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(BrowserName.equals("Firefox"))
		{
			System.setProperty("webdriver.IE.driver",
					"C:\\Users\\Majji Durgaprasad\\eclipse-workspace2\\BMTPLUS\\libs\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Majji Durgaprasad\\eclipse-workspace2\\BMTPLUS\\libs\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		return driver;

	}
	
}
