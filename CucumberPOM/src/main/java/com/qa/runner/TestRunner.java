package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\LILT-71\\git\\TestProject\\CucumberPOM\\src\\main\\java\\com\\qa\\features\\freecrm.feature",
		glue= {"com/qa/stepDefinations"},
	format= {"pretty","html:test-output"},//	,"json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome=true,
		strict=true,
		dryRun=false
				
		)
public class TestRunner {
	

}
