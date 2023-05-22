package com.test.stepdefinitions;

import com.test.task.SearchInformation;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;

public class SearchGoogleStepdefinitions {

    @When("{actor} searches for the following: {string} in Google")
    public void searchInGooogle(Actor actor, String nameTopic){
        actor.wasAbleTo(Open.url("https://google.com/"));
        actor.attemptsTo(
                SearchInformation.about(nameTopic)
        );
    }
}
