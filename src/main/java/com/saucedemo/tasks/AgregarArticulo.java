package com.saucedemo.tasks;

import com.saucedemo.utils.ObtenerInformacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.saucedemo.userinterfaces.AgregarCarrito.*;

public class AgregarArticulo implements Task {
    private int hoja;
    private int fila;

    public AgregarArticulo(int hoja, int fila) {
        this.hoja = hoja;
        this.fila = fila;
    }

    public static Performable conDatos(int hoja, int fila) {
        return Tasks.instrumented(AgregarArticulo.class, hoja, fila);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ObtenerInformacion.getObtener(hoja, fila);

        actor.attemptsTo(
                Click.on(PRODUCT_LABEL.of(ObtenerInformacion.getArticulo())),
                Click.on(BOTTON_ADD_TO_CART),
                Click.on(CART),
                Click.on(BOTTON_CHECKOUT)
        );

    }
}
