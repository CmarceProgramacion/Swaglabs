package com.saucedemo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class PagarArticulo extends PageObject {

    public static final Target INPUT_FIRST_NAME= Target.the("Campo de texto del primer nombre").located(By.id("first-name"));
    public static final Target INPUT_LAST_NAME= Target.the("Campo de texto del apellido").located(By.id("last-name"));
    public static final Target INPUT_POSTAL_CODE= Target.the("Campo de texto del codigo postal").located(By.id("postal-code"));
    public static final Target BOTTON_CONTINUE= Target.the("Boton para continuar con el pago").located(By.id("continue"));
    public static final Target BOTTON_FINISH= Target.the("Boton para continuar con el pago").located(By.id("finish"));
    public static final Target LABEL_FINISH= Target.the("Boton para continuar con el pago").locatedBy("/h2[@class='complete-header']");


    //h2[@class="complete-header"]
}
