package utilPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilityClasses.FileUtility;

public class DriverFactory {
	// public static WebDriver driver;
	public static ThreadLocal<WebDriver> driver = new ThreadLocal();

	public static void setUpBrowser() throws Exception {
		FileUtility fileUtility = new FileUtility();
		String browserName = fileUtility.getDataFromPropertiesFiles("browser");
//		String browserName=System.getProperty("browser","chrome");
		String url = fileUtility.getDataFromPropertiesFiles("url");
		if (browserName.equals("chrome")) {
			driver.set(new ChromeDriver());
			// driver = new ChromeDriver();
		}
		
		else if (browserName.equals("edge")) {
			driver.set(new EdgeDriver());
			// driver = new EdgeDriver();
		} 
		
		else if (browserName.equals("firefox")) {
			driver.set(new FirefoxDriver());
			// driver = new FirefoxDriver();
		} 
		
		else {
			driver.set(new ChromeDriver());
			// driver = new ChromeDriver();
		}
//		driver.manage().window().maximize();
//		driver.get(url);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get().manage().window().maximize();
		driver.get().get(url);
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	public static WebDriver getDriver() {
		return driver.get();
	}

	public static void quitBrowser() {
		if (driver != null)
			driver.get().quit();
	}
}
