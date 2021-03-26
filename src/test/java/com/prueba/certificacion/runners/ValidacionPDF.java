package java.com.prueba.certificacion.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/validacion_pdf.feature",
        glue = {"com.prueba.certificacion.stepdefinitions"},
        snippets = SnippetType.CAMELCASE)

public class ValidacionPDF {
}
