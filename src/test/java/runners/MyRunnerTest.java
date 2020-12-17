package runners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/fetures",monochrome=true,
		glue="stepdef",tags="@RegTest", plugin= {"pretty","json:target/cucumber-reports/Cucumber.json","html:target/cucumber-reports"})

public class MyRunnerTest {
	
	

}