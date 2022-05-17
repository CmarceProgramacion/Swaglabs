package com.saucedemo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarCarrito extends PageObject {

    public static final Target PRODUCT_LABEL= Target.the("producto").locatedBy("//div[@class='inventory_item_name'][contains(.,'{0}')]");
    public static final Target BOTTON_ADD_TO_CART=Target.the("boton adicionar al carrito").locatedBy("//button[starts-with(@id,'add-to-cart')]");
    public static final Target CART=Target.the("Acceder al carrito de compras").located(By.id("shopping_cart_container"));
    public static final Target BOTTON_CHECKOUT=Target.the("Boton para pagos").located(By.id("checkout"));

}
