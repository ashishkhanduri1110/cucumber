package com.cucumber.script;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty", "html:target/cucumber", "json:target/cucumber-report.json"},tags = {"@test"},features={"src/main/java/com/cucumber/script/test.feature"})
public class runnerclass {

}
