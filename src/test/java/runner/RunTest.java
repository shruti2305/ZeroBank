package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="classpath:Features",
        glue = "stepdefs",
        tags= "@login",
        plugin={"pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber-json-report.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        publish=false,
        dryRun = false

)
public class RunTest {
}
