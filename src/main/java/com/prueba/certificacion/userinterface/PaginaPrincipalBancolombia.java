package com.prueba.certificacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.grupobancolombia.com/")

public class PaginaPrincipalBancolombia extends PageObject {

    public static final Target EMPRESAS = Target.the("Seccionar empresas")
            .located(By.id("//a[@id='header-empresas']"));

    public static final Target CAPITAL_INTELIGENTE = Target.the("Seccionar empresas")
            .located(By.id("//a[contains(text(),'Capital Inteligente')]"));

    public static final Target ACTUALIDAD_ECONOMICA = Target.the("Seccionar empresas")
            .located(By.id("//a[contains(text(),'Actualidad económica')]"));
}
