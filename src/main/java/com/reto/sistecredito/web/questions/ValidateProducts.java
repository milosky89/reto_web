package com.reto.sistecredito.web.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.reto.sistecredito.web.ui.UICart.LBL_PRODUCT_NAME;
import static com.reto.sistecredito.web.util.Constants.productList;

public class ValidateProducts implements Question<Boolean> {

    public ValidateProducts(){}

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean productName = false;
        String name;

        for(int i=0; i < productList.size(); i++){
            name = productList.get(i).getProductName();
            productName = LBL_PRODUCT_NAME.of(name).isVisibleFor(actor);
        }
        return productName;
    }
    public static ValidateProducts inCart(){ return  new ValidateProducts();}
}
