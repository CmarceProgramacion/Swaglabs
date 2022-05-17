package com.saucedemo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = "com.saucedemo.stepdefinitions",
        features = "src/test/resources/features/comprar_articulo.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class ComprarArticulo {
}
