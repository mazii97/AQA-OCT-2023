package org.prog.RozetkaPageObject;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;

@CucumberOptions(features = "src/test/resources/features",
        glue = "org.prog.RozetkaPageObject.steps",
        plugin = {"pretty",
                "json:target/cucumber-reports/Cucumber.json",
                "html:target/cucumber-report.html"
        })
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

    @AfterSuite
    public void tearDown() {
        SharedDriver.closeDriver();
    }
}
