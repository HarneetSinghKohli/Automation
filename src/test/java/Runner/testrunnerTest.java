package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features/test.feature"
		,glue= {"seleniumgluecode"}
		)


public class testrunnerTest {


		

}
