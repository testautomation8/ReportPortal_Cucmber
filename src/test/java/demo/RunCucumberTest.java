package demo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (plugin = {"pretty",
                   "html:target/cucumber-html-reports",
                        "json:target/cucumber-html-reports/cucumber.json"
                //,"com.epam.reportportal.cucumber.ScenarioReporter"
        })
public class RunCucumberTest {

}
