package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\san\\eclipse-workspace\\Maven\\Feature file",glue="org.stepdefinitions",dryRun=false,monochrome=true,strict=true)
public class TestRunner {

}
