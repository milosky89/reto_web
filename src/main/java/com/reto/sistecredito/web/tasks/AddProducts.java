package com.reto.sistecredito.web.tasks;

import com.reto.sistecredito.web.interactions.SelectMenu;
import com.reto.sistecredito.web.interactions.SelectProduct;
import com.reto.sistecredito.web.models.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.reto.sistecredito.web.ui.UIHome.*;
import static com.reto.sistecredito.web.ui.UIProduct.*;
import static com.reto.sistecredito.web.util.Constants.*;
import static com.reto.sistecredito.web.util.Constants.productList;
import static com.reto.sistecredito.web.util.RandomNumber.generatRandomNumber;
import static com.reto.sistecredito.web.util.Convert.valueFormat;
import static com.reto.sistecredito.web.util.RandomNumber.generatRandomNumberMenu;

public class AddProducts implements Task {
    int totalNumberItems = 0;
    double total =0;
    double totalCMR =0;
    String total_Str;
    String discount_Str;
    public AddProducts(){}

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(Click.on(NOTIFICATION));
       for (int i=0; i < 2; i++){
           String quantity = generatRandomNumber();
           String subCategory = generatRandomNumberMenu();
           actor.attemptsTo(
                   SelectMenu.inHome(BTN_CATEGORY,SELECT_CATEGORY.of("3"),SELECT_SUBCATEGORY.of(subCategory)),
                   SelectProduct.inCart(quantity)
           );
           totalNumberItems += Integer.parseInt(quantity);
           String productName = PRODUCT_NAME.resolveFor(actor).getText();
           String finalValue = FINAL_VALUE.resolveFor(actor).getText().replace("$", "").replace("(Precio final)", "").trim();
           String valueCMR = VALUE_CMR.resolveFor(actor).getText().replace("$", "").trim();

           Product product = new Product();
           product.setProductName(productName);
           product.setItemsProducts(quantity);
           product.setProductUnitPrice(finalValue);
           product.setProductUnitPriceCMD(valueCMR);

           double totalValue = (Double.parseDouble(finalValue.replace(".","")) * Integer.parseInt(quantity));
           double totalValueCMR = (Double.parseDouble(valueCMR.replace(".","")) * Integer.parseInt(quantity));
           total += totalValue;
           totalCMR += totalValueCMR;

           productList.add(product);
           actor.attemptsTo(Click.on(BTN_CLOSE));
       }

       double discount = total - totalCMR;
       total_Str = valueFormat(total +"");
       discount_Str = valueFormat(discount+"");
       actor.remember(TOTAL_QUANTITY,totalNumberItems+"");
       actor.remember(TOTAL_VALUE_PRODUCTS,total_Str);
       actor.remember(DISCOUNT,discount_Str);
       actor.attemptsTo(Click.on(BTN_CART));
    }

    public static AddProducts toCart(){
        return Tasks.instrumented(AddProducts.class);
    }
}
