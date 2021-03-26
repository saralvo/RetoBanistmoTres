package com.prueba.certificacion.task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.prueba.certificacion.userinterface.PaginaPrincipalBancolombia.ACTUALIDAD_ECONOMICA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ActualidadEconomica implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ACTUALIDAD_ECONOMICA),
                WaitUntil.the(ACTUALIDAD_ECONOMICA, isVisible()),
                Click.on(ACTUALIDAD_ECONOMICA)
        );
    }

    public static ActualidadEconomica darClick() { return instrumented(ActualidadEconomica.class); }
}
