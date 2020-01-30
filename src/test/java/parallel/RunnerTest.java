package parallel;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"summary","timeline:src/test/resources/cucumber-parallel-report"})
public class RunnerTest {
}
