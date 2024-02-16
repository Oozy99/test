package example.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class ProductosPage extends PageObject {
    @FindBy(xpath ="//a[contains(.,'Sauce Labs Backpack')]/../following-sibling::div/button" )
    WebElementFacade botonAgregarCarrito;

}
