package com.prueba.certificacion.task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.prueba.certificacion.userinterface.PaginaPrincipalBancolombia.CAPITAL_INTELIGENTE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarCapiatl implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CAPITAL_INTELIGENTE),
                WaitUntil.the(CAPITAL_INTELIGENTE, isVisible()),
                Click.on(CAPITAL_INTELIGENTE)
        );
    }

    public static SeleccionarCapiatl darClick() { return instrumented(SeleccionarCapiatl.class); }
}
