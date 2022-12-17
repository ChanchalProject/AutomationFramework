package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resource/Feature/SearchIcon.feature",
glue = "StepDefination",
tags = "@tag1",
plugin = {"pretty","html:target/cucumber-reports"},
monochrome = true)

public class Runner {

}
