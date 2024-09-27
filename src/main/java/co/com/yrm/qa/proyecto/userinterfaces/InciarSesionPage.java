package co.com.yrm.qa.proyecto.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.*;

public class InciarSesionPage extends PageObject {

    public static final String SHADOW_SELECTOR_TXT_LOGIN = "#username";

    public static final Target TXT_USUARIO = Target.the("Pais Residencia")
            .locatedBy("#username-input");

    public static final Target SHADOW_SELECTOR_TXT_CLAVE = Target.the("SHADOW_SELECTOR_TXT_CLAVE")
            .locatedBy("#current-password");
    public static final Target TXT_CLAVE  = Target.the("Pais Residencia")
            .locatedBy("#password-input");

    public static final Target BTN_INGRESAR = Target.the("Pais Residencia")
            .located(By.id("login-submit"));

}
