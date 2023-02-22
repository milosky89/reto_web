package com.reto.sistecredito.web.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.reto.sistecredito.web.ui.UICart.*;
import static com.reto.sistecredito.web.util.Constants.*;

public class ValidateTotal implements Question<Boolean> {

    public ValidateTotal(){}

    @Override
    public Boolean answeredBy(Actor actor) {

        String discount_str = actor.recall(DISCOUNT);
        String total_str = actor.recall(TOTAL_VALUE_PRODUCTS);

        boolean discount = LBL_DISCOUNT_CMR.of(discount_str).resolveFor(actor).isVisible();
        boolean subtotal = LBL_TOTAL_TO_PLAY.of(total_str).resolveFor(actor).isVisible();

        return discount && subtotal;
    }

    public static  ValidateTotal incart(){ return new ValidateTotal();}
}
