package org.pages.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/agregar_Producto_carrito.feature",
        glue = "org.example.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class AgregarProductoCarrito {

}
