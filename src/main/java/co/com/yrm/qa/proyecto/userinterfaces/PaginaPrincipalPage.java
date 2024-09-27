package co.com.yrm.qa.proyecto.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipalPage extends PageObject {

    public static final Target SHADOW_SELECTOR_MENU = Target.the("SHADOW_SELECTOR_TXT_CLAVE")
            .locatedBy("siigo-header-molecule[class='data-siigo-five9 hydrated']");

    public static final Target BTN_CREAR  = Target.the("Pais Residencia")
            .locatedBy("siigo-button-atom[data-id='header-create-button']");

    public static final Target BTN_CLIENTES  = Target.the("Pais Residencia")
            .locatedBy("a[data-value='Clientes']");

}
