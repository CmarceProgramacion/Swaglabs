package com.saucedemo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddToCart extends PageObject {

    public static final Target PRODUCT_LABEL = Target.the(" input  product").locatedBy("//div[@class='inventory_item_name'][contains(.,'{0}')]");
    public static final Target BOTTON_ADD_TO_CART = Target.the("Button to add to cart").locatedBy("//button[starts-with(@id,'add-to-cart')]");
    public static final Target CART = Target.the("Access the shopping cart").located(By.id("shopping_cart_container"));
    public static final Target BOTTON_CHECKOUT = Target.the("Payment button").located(By.id("checkout"));

}
