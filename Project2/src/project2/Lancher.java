package project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

public class Lancher {
		
		
	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//driver//chromedriver.exe");
		System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//driver//geckodriver.exe");
		System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//driver//MicrosoftWebDriver.exe");
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY,System.getProperty("user.dir")+"//driver//IEDriverServer.exe");
		//System.setProperty("webdriver.chrome.drivr","D:\\selenium\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.com", "D:\\selenium\\driver\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "D:\\selenium\\driver\\IEDriverServer.exe");
		//System.setProperty("webdriver.edge.driver", "D:\\selenium\\driver\\MicrosoftWebDriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver = new FirefoxDriver();
		driver.get("https://www.cricinfo.com");
		
		driver = new EdgeDriver();
		driver.get("https://www.wwe.com");
		
		driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com");

	}

}
