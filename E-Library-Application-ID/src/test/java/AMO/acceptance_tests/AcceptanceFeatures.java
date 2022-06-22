package AMO.acceptance_tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "uses_cases",
		plugin = {"pretty", "html:target/cucumber", "summary"},
		glue = {"AMO.acceptance_tests"},
		monochrome = true
)

public class AcceptanceFeatures {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
