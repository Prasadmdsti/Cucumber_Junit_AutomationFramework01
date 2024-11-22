package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
//features=".//Features/CreateAccount.feature", //to run single feature file
//features={".//Features/Login.feature",".//Features/CreateAccount.feature"},      //to run multiple feature files
features=".//Features/",                //to run all feature files		
glue="stepDefinitions",
dryRun=false,
monochrome=true,
plugin= {"pretty","html:Reports/result.html"},
tags="@sanity"  // this will execute scenarios tagged with @sanity
//tags="@regression"
//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
		)
public class TestRun {

}
