package RunnerTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/Features/ResturantTant.Feature"},
		//dryRun = true,
		monochrome = true,
		glue = {"steps"}
		)

public class Runner1 extends AbstractTestNGCucumberTests {

}
