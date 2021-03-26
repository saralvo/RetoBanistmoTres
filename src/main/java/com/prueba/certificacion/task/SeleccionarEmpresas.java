package com.prueba.certificacion.task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.prueba.certificacion.userinterface.PaginaPrincipalBancolombia.EMPRESAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarEmpresas implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(EMPRESAS),
                WaitUntil.the(EMPRESAS, isVisible()),
                Click.on(EMPRESAS)
        );
    }

    public static SeleccionarEmpresas darClick() { return instrumented(SeleccionarEmpresas.class); }
}
