package com.ilCarro;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
    glue = "com/ilCarro/stepDefinitions",
    tags = "@wrongPassword",
    //"not @wrongPassword" - without this tag
    //"@navigate or @wrongPassword" - this two classes
    plugin = {"pretty", "json:build/cucumber-report/cucumber.json"})
public class TestRunner {

}
