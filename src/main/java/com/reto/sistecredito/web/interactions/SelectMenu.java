package com.reto.sistecredito.web.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static com.reto.sistecredito.web.ui.UIHome.NOTIFICATION2;

public class SelectMenu implements Interaction {

    private Target menu;
    private Target category;
    private Target subcategory;

    public SelectMenu(Target menu, Target category, Target subcategory){
        this.menu=menu;
        this.category=category;
        this.subcategory=subcategory;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(menu),
                Click.on(category),
                Click.on(subcategory)
        );
        if(NOTIFICATION2.isVisibleFor(actor)){
            actor.attemptsTo(
                    Click.on(NOTIFICATION2)
            );
        }
    }

    public static SelectMenu inHome(Target menu, Target category, Target subcategory){
        return Tasks.instrumented(SelectMenu.class,menu,category,subcategory);
    }
}
