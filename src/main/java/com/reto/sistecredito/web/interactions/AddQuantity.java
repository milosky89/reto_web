package com.reto.sistecredito.web.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class AddQuantity implements Interaction {

    private Target increase;
    int amount;

    public AddQuantity(Target increase, int amount) {
        this.increase = increase;
        this.amount = amount;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (amount > 1){
            for (int i = 1; i < amount; i++) {
                actor.attemptsTo(
                        Click.on(increase)
                );
            }
        }
    }

    public static  AddQuantity product(Target increase, int amount){
        return Tasks.instrumented(AddQuantity.class, increase,amount);
    }
}
