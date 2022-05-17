package com.saucedemo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = "com.saucedemo.stepdefinitions",
        features = "src/test/resources/features/user_authentication.feature",
        tags = "@Case1",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class UserAuthentication {
}
