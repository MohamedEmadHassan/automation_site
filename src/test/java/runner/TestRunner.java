package runner;

import cucumber.api.CucumberOptions;
import helper.TestBase;

@CucumberOptions(features="src/test/java/features",glue="step_definition",plugin={"pretty","html:target/cucumber-html-report"})
public class TestRunner extends TestBase {
}
