import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps"},
        format = {
                "pretty",
                "html:cucumber-reports/cucumber-pretty",
                "json:cucumber-reports/json-reports/CucumberTestReport.json",
        })

public class TestRunner { }