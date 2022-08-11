package Runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features={"src\\test\\resources\\Login1\\Login1.feature"},
glue= {"StepDefinition"},
dryRun=false)
public class TestRunner {

}
