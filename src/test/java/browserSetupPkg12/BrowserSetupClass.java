package browserSetupPkg12;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserSetupClass {
	

	//ConfigReaderClass configRead= new ConfigReaderClass();

	
	 private static WebDriver driver;

	    public static WebDriver getDriver() {
	        if (driver == null) {
	            ChromeOptions options = new ChromeOptions();
	            options.addArguments("--remote-allow-origins=*");
	            //options.addArguments("--headless");
	            
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver(options);
	            driver.manage().window().maximize();
	        }
	        return driver;
	    }
	    

	    public static void quitDriver() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	
	
	}

	