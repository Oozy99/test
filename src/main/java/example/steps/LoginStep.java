package example.steps;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import example.pages.LoginPage;
@DefaultUrl("https://www.saucedemo.com/")
public class LoginStep {
    @Page
    private LoginPage loginPage;

    @Step
    public void abrirNavegador(){
        loginPage.open();
    }

    @Step
    public void realizarAunteticacion(String usuario,String clave){
        loginPage.ingresarUsuario(usuario);
        loginPage.ingresarClave(clave);
        loginPage.clivkBotonLogin();
    }
}
