package com.saucedemo.tasks;

import com.saucedemo.userinterfaces.PageLogin;
import com.saucedemo.utils.GetInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.userinterfaces.PageLogin.BUTTON_LOGIN;
import static com.saucedemo.userinterfaces.PageLogin.USER_NAME;

public class LogIn implements Task {
    private int sheet;
    private int row;

    public LogIn(int sheet, int row) {
        this.sheet = sheet;
        this.row = row;
    }

    public static Performable withData(int sheet, int row) {
        return Tasks.instrumented(LogIn.class, sheet, row);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        GetInformation.getContent(sheet, row);
        actor.attemptsTo(
                Enter.keyValues(GetInformation.getUser()).into(USER_NAME),
                Enter.keyValues(GetInformation.getPassword()).into(PageLogin.PASSWORD),
                Click.on(BUTTON_LOGIN)
        );


    }
}
