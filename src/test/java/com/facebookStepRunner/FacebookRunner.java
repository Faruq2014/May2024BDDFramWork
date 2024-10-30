package com.facebookStepRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin= {
      "pretty",	
      "html:target/facebookTestReport.html",
      "html:target/facebookTestReport.json",
      "html:target/facebookTestReport.xml"
          },
    features="src/test/resources/features",
    glue="com.facebookTests",
    monochrome=true,
  //  tags="@Smoke"
    tags="@Regression"

		)
public class FacebookRunner {

}
