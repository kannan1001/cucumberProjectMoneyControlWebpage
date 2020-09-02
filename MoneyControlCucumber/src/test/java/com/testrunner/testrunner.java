package com.testrunner;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Cucumber class
//@RunWith(Cucumber.class) this is only for junit shouldn't be used while using testng
@CucumberOptions(

		features = "/Users/geerthanakannan/eclipse-workspace/MoneyControlCucumber/src/test/resources/resources/Features/testcase.feature", 
		glue = {"com.stepDefinition" }, plugin = { "pretty", "html:reports/cucumber-html-report",
						"json:reports/cucumber-html-report/jsonreport",
						"com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/resources/Reports/Extentreports/Extentreport.html" },
		tags = {"@tc_01_Specials,@tc_02_English,@tc_03_Login"},
		monochrome = true)

public class testrunner extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void extendReport() {
		 Reporter.loadXMLConfig("src/test/resources/resources/ConfigProperties/extent_config.xml");
		 Reporter.setSystemInfo("user", System.getProperty("user.name"));
		 Reporter.setSystemInfo("os", "Mac");
		 Reporter.setTestRunnerOutput("Sample test runner output message");
	}

}
