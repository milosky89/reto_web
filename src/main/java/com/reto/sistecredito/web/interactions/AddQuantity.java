package com.reto.sistecredito.web.interactions;

import net.bytebuddy.matcher.VisibilityMatcher;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import java.time.Duration;

import static com.reto.sistecredito.web.ui.UIProduct.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddQuantity implements Interaction {


    int amount;

    public AddQuantity( int amount) {

        this.amount = amount;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (amount > 1){
            for (int i = 1; i < amount; i++) {
                actor.attemptsTo(
                        WaitUntil.the(BTN_INCREASE_AMOUNT, isVisible()).forNoMoreThan(Duration.ofSeconds(3)),
                        Click.on(BTN_INCREASE_AMOUNT)
                );
            }
        }
    }

    public static  AddQuantity product( int amount){
        return Tasks.instrumented(AddQuantity.class,amount);
    }
}
