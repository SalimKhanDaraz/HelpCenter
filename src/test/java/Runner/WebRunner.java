package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = "StepDefinitions",
        plugin = {
                "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/json-reports/CucumberTestReport.json",
        }
)

public class WebRunner extends AbstractTestNGCucumberTests {

}