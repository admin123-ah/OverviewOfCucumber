package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "/Users/parassingh/Assignments/OverviewOfCucumber/src/main/java/Features/assignment.feature",
   //path of step definition file
   glue = "Binding",
   tags = "@tag3",
   monochrome = true,
   plugin = {"pretty", "html: target/cucumber-reports"}
		   
   )

public class runner {

}
