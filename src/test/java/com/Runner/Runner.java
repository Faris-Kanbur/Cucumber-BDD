package com.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(features="src/test/resources/Features",glue={"com.StepDefinitions"},
monochrome=true, plugin= {"html:Reports/Cucumber.html", "json:Reports/Cucumber.json","junit:Reports/Cucumber.xml" },
dryRun=true, tags="@SmokeTest or @SanityTest")

public class Runner  {

}

 