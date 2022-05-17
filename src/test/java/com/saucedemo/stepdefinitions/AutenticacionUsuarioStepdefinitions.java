package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.ValidarMensaje;
import com.saucedemo.tasks.IniciarSesion;
import com.saucedemo.utils.ExtraerData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import java.util.ArrayList;

import static com.saucedemo.utils.ListaAccesos.URL_EXCEL;
import static com.saucedemo.utils.ListaAccesos.URL_PLATAFORMA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionUsuarioStepdefinitions {


    @Given("usuario ingresa a la pagina SWAGLABS")
    public void usuarioIngresaALaPaginaSWAGLABS() {
        theActorInTheSpotlight().wasAbleTo(
                Open.url(URL_PLATAFORMA.getRuta())
        );
    }

    @When("Ingresa el nombre del usuario y la contrasena")
    public void ingresaElNombreDelUsuarioYLaContrasena() {
        ExtraerData dataUsuario = new ExtraerData(URL_EXCEL.getRuta());
        ArrayList<String> datos = dataUsuario.ObtenerData();
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.conDatos(datos.get(0), datos.get(1))
        );
    }

    @Then("valida el mensaje de la pagina principal {string}")
    public void validaElMensajeDeLaPaginaPrincipal(String mensaje) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidarMensaje.paginaPrincipal(mensaje))
        );

    }
}
