package com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static com.test.userinterface.HomeDuckDuckGoPage.SEARCH_FIELD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchInformation implements Task {

    private String nameTopic;

    public SearchInformation(String nameTopic) {
        this.nameTopic = nameTopic;
    }

    public static SearchInformation about(String nameTopic){
        return instrumented(SearchInformation.class, nameTopic);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nameTopic).into(SEARCH_FIELD),
                Hit.the(Keys.ENTER).keyIn(SEARCH_FIELD)
        );
    }

}
