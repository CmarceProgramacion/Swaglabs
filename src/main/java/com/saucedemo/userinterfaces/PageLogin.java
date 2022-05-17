package com.saucedemo.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PageLogin extends PageObject {

    public static final Target USER_NAME = Target.the("campo de nombre de usuario").located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("Campo de password").located(By.id("password"));
    public static final Target BUTTON_LOGIN = Target.the("Boton de login").located(By.id("login-button"));
    public static final Target MESSAGE_PAGE = Target.the("Mensaje de la pagina principal").locatedBy("//span[contains(.,'{0}')]");

}
