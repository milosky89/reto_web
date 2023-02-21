package com.reto.sistecredito.web.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;


import static com.reto.sistecredito.web.ui.UIHome.BTN_VIEWALL;
import static com.reto.sistecredito.web.util.RandomNumber.generatRandomNumber;

public class SelectMenu implements Interaction {

    String categoryValue = generatRandomNumber(1);
    private Target menu;
    private Target category;

    public SelectMenu(Target menu, Target category){
        this.menu=menu;
        this.category=category;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(menu),
                Click.on(category.of(categoryValue)),
                Click.on(BTN_VIEWALL)
        );
    }

    public static SelectMenu inHome(Target menu, Target category){
        return Tasks.instrumented(SelectMenu.class,menu,category);
    }
}
