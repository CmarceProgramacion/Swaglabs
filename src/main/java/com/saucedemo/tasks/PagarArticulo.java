package com.saucedemo.tasks;

import com.saucedemo.utils.ObtenerInformacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.userinterfaces.PagarArticulo.*;

public class PagarArticulo implements Task {
    private int hoja;
    private int fila;

    public PagarArticulo(int hoja, int fila) {
        this.hoja = hoja;
        this.fila = fila;
    }

    public static Performable conDatos(int hoja, int fila) {
        return Tasks.instrumented(PagarArticulo.class, hoja, fila);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ObtenerInformacion.getObtener(hoja,fila);
        actor.attemptsTo(
                Enter.keyValues(ObtenerInformacion.getNombre()).into(INPUT_FIRST_NAME),
                Enter.keyValues(ObtenerInformacion.getApellido()).into(INPUT_LAST_NAME),
                Enter.keyValues(ObtenerInformacion.getCodigoPostal()).into(INPUT_POSTAL_CODE),
                Click.on(BOTTON_CONTINUE),
                Click.on(BOTTON_FINISH)
        );



    }
}
