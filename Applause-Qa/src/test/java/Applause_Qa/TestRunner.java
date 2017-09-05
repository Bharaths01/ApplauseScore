package Applause_Qa;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\Bharath\\eclipse-workspace\\Applause-Qa\\src\\test\\java\\ApplauseFeatures\\ApplauseTest1.feature"},
		 plugin = {"pretty","html:target/selenium-reports"}
	
		)

public class TestRunner {

}
