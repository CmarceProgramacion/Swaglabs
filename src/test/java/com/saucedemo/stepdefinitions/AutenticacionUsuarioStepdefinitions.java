package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.ValidarMensaje;
import com.saucedemo.tasks.IniciarSesion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;

import static com.saucedemo.utils.ListaAccesos.URL_PLATAFORMA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionUsuarioStepdefinitions {



    @Given("usuario ingresa a la pagina SWAGLABS")
    public void usuarioIngresaALaPaginaSWAGLABS() {
        theActorInTheSpotlight().wasAbleTo(
                Open.url(URL_PLATAFORMA.getRuta())
        );
    }

    @When("Ingresa credenciales con la informacion de la {int} y {int}")
    public void ingresaCredencialesConLaInformacionDeLaY(int hoja, int fila) {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.conDatos(hoja, fila)
        );


    }

    @Then("valida el mensaje de la pagina principal {string}")
    public void validaElMensajeDeLaPaginaPrincipal(String mensaje) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidarMensaje.paginaPrincipal(mensaje))
        );

    }
}
