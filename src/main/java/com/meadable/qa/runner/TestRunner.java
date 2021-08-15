package com.meadable.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/sarit/OneDrive/Desktop/workspace/MEDABLE_Test/src/main/java/com/meadable/qa/features",glue={"/com/meadable/qa/stepDefinations"})
public class TestRunner {

}
