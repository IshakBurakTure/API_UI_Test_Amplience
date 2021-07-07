package Amplience.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports"},
        features = "src/test/resources/features",
        glue = "Amplience/steps",
        tags = "@prj",
        dryRun = false
)

public class CukesRunner {
}


    /** I run my Cucumber Framework through my CukesRunner class.
     * With plugin, I can check the reports.
     * Tags help me to run specific Scenario.
     * Dry run helps me to quickly scan my features without actually running them.
     *
     * */
