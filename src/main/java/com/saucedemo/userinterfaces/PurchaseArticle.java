package com.saucedemo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class PurchaseArticle extends PageObject {

    public static final Target INPUT_FIRST_NAME = Target.the("First name text field").located(By.id("first-name"));
    public static final Target INPUT_LAST_NAME = Target.the("Last name text field").located(By.id("last-name"));
    public static final Target INPUT_POSTAL_CODE = Target.the("Zip code text field").located(By.id("postal-code"));
    public static final Target BOTTON_CONTINUE = Target.the("Continue payment button").located(By.id("continue"));
    public static final Target BOTTON_FINISH = Target.the("Button to finalize paymen").located(By.id("finish"));

}
