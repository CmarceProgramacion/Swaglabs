package com.saucedemo.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class HooksStepdefinitions {
        @Before
        public void initialConfig() {
            OnStage.setTheStage(new OnlineCast());
            OnStage.theActor("Benito");
        }
}
