package com.test.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.test.utils.ValidateEnvironmentsVariable.validateEnvironmentVariable;

public class ParameterDefinitions {

    @ParameterType(".*")
    public Actor actor(String actorName){
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setTheStage() throws Exception {
        validateEnvironmentVariable();
        OnStage.setTheStage(new OnlineCast());
    }
}
