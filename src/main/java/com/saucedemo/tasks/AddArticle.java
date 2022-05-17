package com.saucedemo.tasks;

import com.saucedemo.utils.GetInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.saucedemo.userinterfaces.AddToCart.*;

public class AddArticle implements Task {
    private int sheet;
    private int row;

    public AddArticle(int sheet, int row) {
        this.sheet = sheet;
        this.row = row;
    }

    public static Performable conDatos(int sheet, int row) {
        return Tasks.instrumented(AddArticle.class, sheet, row);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        GetInformation.getContent(sheet, row);
        actor.attemptsTo(
                Click.on(PRODUCT_LABEL.of(GetInformation.getArticle())),
                Click.on(BOTTON_ADD_TO_CART),
                Click.on(CART),
                Click.on(BOTTON_CHECKOUT)
        );

    }
}
