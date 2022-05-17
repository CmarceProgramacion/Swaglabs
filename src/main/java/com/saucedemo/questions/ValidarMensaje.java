package com.saucedemo.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.saucedemo.userinterfaces.PageLogin.*;

public class ValidarMensaje implements Question<Boolean> {
    private String mensaje;

    public ValidarMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public static ValidarMensaje paginaPrincipal(String mensaje){
        return new ValidarMensaje(mensaje);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensajePlataforma = MESSAGE_PAGE.of(mensaje).resolveFor(actor).getText();
        return mensaje.equalsIgnoreCase(mensajePlataforma);
    }
}
