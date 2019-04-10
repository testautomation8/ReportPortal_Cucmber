package demo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (plugin = {"pretty",
                   "html:target/cucumber-reports"
                //,"com.epam.reportportal.cucumber.ScenarioReporter"
        })
public class RunCucumberTest {

}
