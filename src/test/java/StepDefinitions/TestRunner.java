package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\Features",glue= {"StepDefinitions"},
monochrome=true,
plugin={"pretty","html:target/reports.html",
		"pretty", "json:target/JSONreports/report.json",
		 "pretty","junit:target/JUnitReports/report.xml"},
tags="smokeTest")
public class TestRunner {

}
