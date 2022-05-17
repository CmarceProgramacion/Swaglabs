package com.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.userinterfaces.PagarArticulo.*;

public class PagarArticulo implements Task {
    private String name;
    private String lastName;
    private String codePost;

    public PagarArticulo(String name, String lastName, String codePost) {
        this.name = name;
        this.lastName = lastName;
        this.codePost = codePost;
    }

    public static Performable conDatos(String name, String lastName, String codePost) {
        return Tasks.instrumented(PagarArticulo.class, name,lastName,codePost);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(name).into(INPUT_FIRST_NAME),
                Enter.keyValues(lastName).into(INPUT_LAST_NAME),
                Enter.keyValues(codePost).into(INPUT_POSTAL_CODE),
                Click.on(BOTTON_CONTINUE),
                Click.on(BOTTON_FINISH)
        );



    }
}
