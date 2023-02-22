package com.reto.sistecredito.web.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIProduct {

    public static final Target PRODUCT = Target.the("select product")
            .locatedBy(" //div[@id = 'testId-searchResults-products']//following::b[1]");
    public static final Target BTN_ADD_TO_BAG = Target.the("add to bag button").located(By.id("add-to-cart-button"));
    public static final Target BTN_INCREASE_AMOUNT = Target.the("increase amount\n").located(By.id("testId-stepper-increment-btn"));
    public static final Target PRODUCT_NAME = Target.the("Product name").locatedBy("//div[contains(@class,'jsx-2312484588 item-info')]/span[2]");
    public static final Target FINAL_VALUE = Target.the("final product price").locatedBy("(//div[contains(@class,'jsx-2797633547 cmr-icon-container')]/span)[2]");
    public static final Target VALUE_CMR = Target.the("price with CMR product").locatedBy("(//div[contains(@class,'jsx-2797633547 cmr-icon-container')]/span)[1]");
    public static final Target BTN_CLOSE = Target.the("Button to close the bag").located(By.xpath("//button[contains(text(),'Seguir comprando')]"));
    public static final Target BTN_CART = Target.the("Cart button").located(By.xpath("//span[contains(text(),'Bolsa')]"));

}
