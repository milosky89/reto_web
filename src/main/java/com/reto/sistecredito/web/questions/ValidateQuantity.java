package com.reto.sistecredito.web.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.reto.sistecredito.web.ui.UICart.LBL_QUANTITY;
import static com.reto.sistecredito.web.util.Constants.TOTAL_QUANTITY;

public class ValidateQuantity implements Question<Boolean> {

    public ValidateQuantity(){}

    @Override
    public Boolean answeredBy(Actor actor) {
        String quantity_str = actor.recall(TOTAL_QUANTITY);
        boolean  quantity=LBL_QUANTITY.of(quantity_str).resolveFor(actor).isVisible();

        return  quantity;
    }

    public static ValidateQuantity inCart(){ return new ValidateQuantity();}
}
