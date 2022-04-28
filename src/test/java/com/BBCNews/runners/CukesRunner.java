package com.BBCNews.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports"},
        features ="src/test/resources/features/",
        glue = "com/BBCNews/step_definitions",
        dryRun = false ,
        tags = "@Signin",
        strict =true
)

public class CukesRunner{
 

}
