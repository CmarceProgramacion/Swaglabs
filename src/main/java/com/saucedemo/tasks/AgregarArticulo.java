package com.saucedemo.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.saucedemo.userinterfaces.AgregarCarrito.*;


public class AgregarArticulo implements Task {
    private String articulo;

    public AgregarArticulo(String articulo) {
        this.articulo = articulo;
    }

    public static Performable conDatos(String articulo) {
        return Tasks.instrumented(AgregarArticulo.class, articulo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCT_LABEL.of(articulo)),
                Click.on(BOTTON_ADD_TO_CART),
                Click.on(CART),
                Click.on(BOTTON_CHECKOUT)
        );

    }
}
