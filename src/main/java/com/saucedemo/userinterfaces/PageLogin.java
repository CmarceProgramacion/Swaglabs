package com.saucedemo.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PageLogin extends PageObject {

    public static final Target USER_NAME = Target.the("user name field").located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("Password field").located(By.id("password"));
    public static final Target BUTTON_LOGIN = Target.the("Button of login").located(By.id("login-button"));
    public static final Target MESSAGE_PAGE = Target.the("Home page message").locatedBy("//span[contains(.,'{0}')]");

}
