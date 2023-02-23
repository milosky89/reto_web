package com.reto.sistecredito.web.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.reto.sistecredito.web.ui.UIProduct.*;

public class SelectProduct implements Task {
    String quantity;
    public SelectProduct(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(
              //Scroll.to(PRODUCT),
              Click.on(PRODUCT),
              Click.on(BTN_ADD_TO_BAG),
              AddQuantity.product(BTN_INCREASE_AMOUNT,Integer.parseInt(quantity))
      );
    }
    public static SelectProduct inCart(String quantity){
        return Tasks.instrumented(SelectProduct.class,quantity);
    }
}
