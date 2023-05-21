package com.test.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/search/search_in_duckduckgo.feature",
        glue = {"com/test/stepdefinitions"}
)
public class DuckDuckGoRunner {
}
