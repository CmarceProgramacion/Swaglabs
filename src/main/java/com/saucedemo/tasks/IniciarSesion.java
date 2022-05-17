package com.saucedemo.tasks;

import com.saucedemo.userinterfaces.PageLogin;
import com.saucedemo.utils.ObtenerInformacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.userinterfaces.PageLogin.BUTTON_LOGIN;
import static com.saucedemo.userinterfaces.PageLogin.USER_NAME;

public class IniciarSesion implements Task {
    private int hoja;
    private int fila;

    public IniciarSesion(int hoja, int fila) {
        this.hoja = hoja;
        this.fila = fila;
    }

    public static Performable conDatos(int hoja, int fila) {
        return Tasks.instrumented(IniciarSesion.class, hoja, fila);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        ObtenerInformacion.getObtener(hoja,fila);
        actor.attemptsTo(
                Enter.keyValues(ObtenerInformacion.getUsuario()).into(USER_NAME),
                Enter.keyValues(ObtenerInformacion.getPassword()).into(PageLogin.PASSWORD),
                Click.on(BUTTON_LOGIN)
        );


    }
}
