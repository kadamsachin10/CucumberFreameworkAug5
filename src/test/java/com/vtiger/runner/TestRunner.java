package com.vtiger.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/Features",
        glue = "com.vtiger.stepdefinations",
        dryRun = false,
        plugin = {"pretty","html:target/cucumber-html-report.html"},
        tags = "@leads",
        monochrome = false





)
public class TestRunner
{






}
