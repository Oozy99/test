package org.pages.stepdefinitions;

import example.steps.LoginStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class AgregarProductoStepDefinition {

    @Managed
    WebDriver driver;

    @Steps
    LoginStep loginStep;

    @Dado("que estoy en Soudemo")
    public void queEstoyEnSoudemo() {

        loginStep.abrirNavegador();
        loginStep.realizarAunteticacion("locked_out_user", "secret_sauce");

        throw new io.cucumber.java.PendingException();
    }
    @Cuando("se agrega un producto al carrito")
    public void seAgregaUnProductoAlCarrito() {

        throw new io.cucumber.java.PendingException();
    }
    @Entonces("verifico que se encuentre en la lista de compras")
    public void verificoQueSeEncuentreEnLaListaDeCompras() {

        throw new io.cucumber.java.PendingException();
    }
}
