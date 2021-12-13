package com.amazontv.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Features",
	glue = "com.amazontv.stepdefinition",
	plugin = "html:target",
	monochrome = true,
	dryRun = false,
	tags = "@tv")
public class TestRunner {

}
