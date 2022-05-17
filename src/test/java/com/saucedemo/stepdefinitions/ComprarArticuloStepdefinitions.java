package com.saucedemo.stepdefinitions;

import com.saucedemo.tasks.AgregarArticulo;
import com.saucedemo.tasks.IniciarSesion;
import com.saucedemo.tasks.PagarArticulo;
import com.saucedemo.utils.ExtraerData;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import static com.saucedemo.utils.ListaAccesos.URL_EXCEL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprarArticuloStepdefinitions {

    @When("Selecciona el producto agregandolo al carrito")
    public void seleccionaElProductoAgregandoloAlCarrito() {

        ExtraerData dataUsuario = new ExtraerData(URL_EXCEL.getRuta());
        ArrayList<String> datos = dataUsuario.ObtenerData();

        theActorInTheSpotlight().attemptsTo(
                AgregarArticulo.conDatos(datos.get(2)),
                PagarArticulo.conDatos(datos.get(3), datos.get(4), datos.get(5))
        );

    }
}
