package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.ValidateMessage;
import com.saucedemo.tasks.LogIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;

import static com.saucedemo.utils.AccessList.URL_PLATFORM;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserAuthenticationStepdefinitions {


    @Given("user enters the page SWAGLABS")
    public void userEntersThePageSWAGLABS() {
        theActorInTheSpotlight().wasAbleTo(
                Open.url(URL_PLATFORM.getRoute())
        );
    }

    @When("Enter credentials with the information from the {int} and {int}")
    public void enterCredentialsWithTheInformationFromAnd(int sheet, int row) {
        theActorInTheSpotlight().attemptsTo(
                LogIn.withData(sheet, row)
        );
    }

    @Then("validates home page message {string}")
    public void validatesHomePageMessage(String menssage) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateMessage.principalPage(menssage))
        );

    }
}
