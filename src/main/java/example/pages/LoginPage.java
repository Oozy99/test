package example.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    @FindBy (id="user-name")
    public WebElementFacade inputUsuario;

    @FindBy(id="password")
    public WebElementFacade inputClave;

    @FindBy (id="login-button")
    public WebElementFacade inputBotonLogin;

    public void  ingresarUsuario (String usuario){
        inputUsuario.type(usuario);

    }

    public void ingresarClave(String clave){
        inputClave.type(clave);
    }

    public void clivkBotonLogin(){
        inputBotonLogin.waitUntilEnabled();
        inputBotonLogin.click();
    }

}
