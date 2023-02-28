package runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\QA\\Selenium_WorkSpace\\CucumberProjectBatch66\\src\\test\\java\\features\\login.feature"},//the path of the feature files
		glue={"stepDefinations"}//step Defination Package Name
		)

public class ScotiaTest {
	
}
