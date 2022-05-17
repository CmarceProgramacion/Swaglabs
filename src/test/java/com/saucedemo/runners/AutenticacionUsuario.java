package com.saucedemo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = "com.saucedemo.stepdefinitions",
        features = "src/test/resources/features/autenticacion_usuario.feature",
        tags = "@Caso1",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class AutenticacionUsuario {
}
