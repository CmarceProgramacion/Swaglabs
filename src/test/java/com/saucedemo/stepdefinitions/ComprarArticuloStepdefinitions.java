package com.saucedemo.stepdefinitions;

import com.saucedemo.tasks.AgregarArticulo;
import com.saucedemo.tasks.PagarArticulo;
import io.cucumber.java.en.Given;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprarArticuloStepdefinitions {


    @Given("Selecciona el producto agregandolo al carrito de la {int} y {int}")
    public void seleccionaElProductoAgregandoloAlCarritoDeLaY(int hoja, int fila) {
        theActorInTheSpotlight().attemptsTo(
                AgregarArticulo.conDatos(hoja, fila),
                PagarArticulo.conDatos(hoja, fila)
        );

    }
}
