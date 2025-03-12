package utilPkg12;

import org.openqa.selenium.WebDriver;

import browserSetupPkg12.BrowserSetupClass;
import io.cucumber.java.*;

public class HooksClass {

	WebDriver driver = BrowserSetupClass.getDriver();


	@After
	public void afterScenario(Scenario scenario) {
		
		if (scenario.isFailed()) {

			TakeSSclass.takeScreenshot(driver, scenario.getName());
		}

		//BrowserSetupClass.quitDriver();
	}

}
