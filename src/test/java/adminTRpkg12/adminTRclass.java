
package adminTRpkg12;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features="src/test/resources/featureFiles12/multiReward.feature",
		glue= {"stepDefinitionPkg12", "utilPkg12"}, 
		//tags="@reward", 
		plugin= {"pretty", "html:target/ html-reports/ reports.html"}

		)

public class adminTRclass{ 

	// public class adminTRclass extends AbstractTestNGCucumberTests { 
}
