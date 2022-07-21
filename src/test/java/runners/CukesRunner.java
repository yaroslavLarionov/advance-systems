package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/report.html",
                "json:target/cucumber-reports/cucumber.json",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = {"step_definitions"},
        stepNotifications = true,
<<<<<<< HEAD
        dryRun = false,
        tags = "@ADVSYS-13"

=======
        dryRun = true
>>>>>>> 5ece2d9f507056554a16d7b185af6ebe399154e2

)
public class CukesRunner {
}
