package com.saucedemo.stepdefinitions;

import com.saucedemo.tasks.AddArticle;
import com.saucedemo.tasks.PurchaseArticle;
import io.cucumber.java.en.Given;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyArticleStepdefinitions {


    @Given("Select the product by adding it to the shopping cart {int} and {int}")
    public void seleccionaElProductoAgregandoloAlCarritoDeLaY(int sheet, int row) {
        theActorInTheSpotlight().attemptsTo(
                AddArticle.conDatos(sheet, row),
                PurchaseArticle.withData(sheet, row)
        );

    }
}
