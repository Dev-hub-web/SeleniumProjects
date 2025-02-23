package Runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", // Path to your feature files
        glue = "", // Package where step definitions are located
        plugin = {"pretty", "html:target/cucumber-reports"} // Plugins for reporting
)
public class testRunner {
}
