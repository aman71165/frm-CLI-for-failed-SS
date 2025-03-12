package utilPkg12;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeSSclass { 

	public static void takeScreenshot(WebDriver driver, String scenarioName) {

		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
     
		String fileName = scenarioName + "_" + timestamp + ".png";
        
        
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
		File desti = new File("src/test/resources/screenshots/" + fileName);
		
		try {
			FileUtils.copyFile(source, desti);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}


}
