package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = {
    "com.appiancorp.ps.cucumber"}, plugin = {"pretty"}, tags = "@Tempo and not @Application")
public class RunCucumberForAppianTest {
}
