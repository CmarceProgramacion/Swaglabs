package com.saucedemo.tasks;

import com.saucedemo.userinterfaces.PageLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.userinterfaces.PageLogin.BUTTON_LOGIN;
import static com.saucedemo.userinterfaces.PageLogin.USER_NAME;

public class IniciarSesion implements Task {
    private String userName;
    private String password;

    public IniciarSesion(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public static Performable conDatos(String userName, String password) {
        return Tasks.instrumented(IniciarSesion.class, userName, password);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(userName).into(USER_NAME),
                Enter.keyValues(password).into(PageLogin.PASSWORD),
                Click.on(BUTTON_LOGIN)
        );


    }
}
