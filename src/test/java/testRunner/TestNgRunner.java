package testRunner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import testRunner.FeaturePath;

@CucumberOptions

(

	features={FeaturePath.Login,FeaturePath.LoginDDt},
	
	glue={"stepDefinitions","TestBase"},
	
	plugin={"pretty","html:reports/myreport.html",
			"json:reports/myreport.json",
			"rerun:target/rerun.txt", //Mandatory to capture failure
			 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			},
	
	// dryRun=false,
	//monochrome=true,
	// tags = "@sanity"	//Scenarios tagged with @sanity,
	tags="@sanity" //Scenarios tagged with both @sanity and @regression
	//tags = "@sanity or @regression"	 //Scenarios tagged with either @sanity or @regression
	//tags = "@sanity and not @regression", //Scenarios tagged with @sanity but not tagged with @regressi
	
	)

public class TestNgRunner extends AbstractTestNGCucumberTests{
	
	
}
