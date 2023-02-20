package com.reto.sistecredito.web.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@CucumberOptions(
        features = {"src/test/resources/features/add_product.feature"}
        ,tags = "@addProductsSuccessful"
        ,glue = {"com.reto.sistecredito.web.stepsdefinitions"}
        ,snippets = CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class RunnerCucumber {
}
