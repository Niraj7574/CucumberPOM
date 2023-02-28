package com.qa.runnerClass;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\QA\\Selenium_WorkSpace\\CucumberProjectBatch66\\src\\main\\java\\com\\qa\\features"}, //the path of the feature files package
		glue={"com\\qa\\stepDefinitions"}, //Path of the step Definition files
		format= {"pretty","html:test-output","json:json_output/cucumber.jason","junit:junit_xml/cucumber.xml"}, // to generate different types of report
		monochrome = true, //to display console output user friendly of more readable 
		strict = true, //it will check if any step is not defined in the stepDefinition
		dryRun = false //to check mapping is proper between feature file and stepDdefinition file
		//tags = {"@SmokeTest, ~@RegressionTest"}
	
		)

public class TestRunner {
	
}
