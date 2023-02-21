package com.reto.sistecredito.web.tasks;

import com.reto.sistecredito.web.interactions.SelectMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.reto.sistecredito.web.ui.UIHome.*;

public class AddProducts implements Task {

    public AddProducts(){}

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    Click.on(NOTIFICATION),
                    SelectMenu.inHome(BTN_CATEGORY,SELECT_CATEGORY)
            );
    }

    public static AddProducts toCart(){
        return Tasks.instrumented(AddProducts.class);
    }
}
