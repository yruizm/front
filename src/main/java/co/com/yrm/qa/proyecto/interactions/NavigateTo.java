package co.com.yrm.qa.proyecto.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().thePageNamed("pages.siigo"));
        //actor.attemptsTo(Open.url("https://bancolombia--uat.sandbox.my.salesforce.com"));
    }

    public static Performable siigo() {
        return Tasks.instrumented(NavigateTo.class);
    }
}

