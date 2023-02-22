package com.reto.sistecredito.web.ui;

import com.reto.sistecredito.web.util.Constants;
import net.serenitybdd.screenplay.targets.Target;

public class UICart {

    public static final Target LBL_QUANTITY = Target.the("quantity of products")
            .locatedBy("//span[@class='count-container']/span[contains(.,'{0}')]/../span[contains(.,'producto')]");
    public static final Target LBL_TOTAL_TO_PLAY= Target.the("total to play")
            .locatedBy("//span[text()='Sub-total productos']/following::span[contains(.,'{0}')]");
    public static final Target LBL_DISCOUNT_CMR = Target.the("discount CMR")
            .locatedBy("//span[text()='Descuento CMR']/following::span[contains(.,'{0}')]");
    public static final Target LBL_PRODUCT_NAME = Target.the("product name")
            .locatedBy(" //h4[@class='fb-product__title']/a[contains(text(),'{0}')]");
    private UICart(){
        throw new IllegalStateException(Constants.USER_INTERFACE_CLASS);
    }
}
