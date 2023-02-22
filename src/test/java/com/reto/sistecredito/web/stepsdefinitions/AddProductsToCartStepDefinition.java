package com.reto.sistecredito.web.stepsdefinitions;

import com.reto.sistecredito.web.questions.ValidateProducts;
import com.reto.sistecredito.web.questions.ValidateQuantity;
import com.reto.sistecredito.web.questions.ValidateTotal;
import com.reto.sistecredito.web.tasks.AddProducts;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AddProductsToCartStepDefinition {

    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
    }
    @Given("{string} want to navigate to {string}")
    public void wantToNavigateTo(String user, String url) {
        theActorCalled(user).attemptsTo(Open.url(url));
    }
    @When("add products to cart")
    public void addProductsToCart() {
        theActorInTheSpotlight().attemptsTo(AddProducts.toCart());
    }
    @Then("I can see the name of the products")
    public void iCanSeeTheNameOfTheProducts() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateProducts.inCart()));
    }
    @Then("I can see the number of products")
    public void iCanSeeTheNumberOfProducts() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateQuantity.inCart()));
    }
    @Then("I can see the subtotal of all products")
    public void iCanSeeTheSubtotalOfAllProducts() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTotal.incart()));
    }
}
