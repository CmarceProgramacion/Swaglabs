package com.saucedemo.tasks;

import com.saucedemo.utils.GetInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.userinterfaces.PurchaseArticle.*;

public class PurchaseArticle implements Task {
    private int sheet;
    private int row;

    public PurchaseArticle(int sheet, int row) {
        this.sheet = sheet;
        this.row = row;
    }

    public static Performable withData(int sheet, int row) {
        return Tasks.instrumented(PurchaseArticle.class, sheet, row);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        GetInformation.getContent(sheet, row);
        actor.attemptsTo(
                Enter.keyValues(GetInformation.getName()).into(INPUT_FIRST_NAME),
                Enter.keyValues(GetInformation.getLastName()).into(INPUT_LAST_NAME),
                Enter.keyValues(GetInformation.getPostalCode()).into(INPUT_POSTAL_CODE),
                Click.on(BOTTON_CONTINUE),
                Click.on(BOTTON_FINISH)
        );
    }
}
