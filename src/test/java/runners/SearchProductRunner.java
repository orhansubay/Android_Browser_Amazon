package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features/", // Test scenarios
        glue = "step", // Steps definitions
        dryRun = false,
        tags = {"@NewCase"},
        strict = true
)
public class SearchProductRunner {
}
