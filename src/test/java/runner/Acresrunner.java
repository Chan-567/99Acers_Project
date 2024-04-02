package runner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Features",
		glue="step_definition",
		plugin={"pretty","html:target/cucumber.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"json:target/cucumberReports.json",
				"junit:target/cucumberReports.xml"})

public class Acresrunner extends AbstractTestNGCucumberTests{
}
