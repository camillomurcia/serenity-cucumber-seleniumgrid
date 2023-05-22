package com.test.stepdefinitions;

import com.test.task.SearchInformation;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class SearchDuckDuckGoStepdefinitions {

    @When("{actor} searches for the following: {string} in DuckDuckGo")
    public void searchinDuckDuckGo(Actor actor, String nameTopic){
        actor.wasAbleTo(Open.url("https://duckduckgo.com/"));
        actor.attemptsTo(
                SearchInformation.about(nameTopic)
        );
    }
}
