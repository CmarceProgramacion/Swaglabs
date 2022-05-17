package com.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.saucedemo.userinterfaces.PageLogin.MESSAGE_PAGE;

public class ValidateMessage implements Question<Boolean> {
    private String menssage;

    public ValidateMessage(String menssage) {
        this.menssage = menssage;
    }

    public static ValidateMessage principalPage(String menssage) {
        return new ValidateMessage(menssage);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String PlatformMessage = MESSAGE_PAGE.of(menssage).resolveFor(actor).getText();
        return menssage.equalsIgnoreCase(PlatformMessage);
    }
}
