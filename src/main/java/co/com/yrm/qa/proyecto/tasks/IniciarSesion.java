package co.com.yrm.qa.proyecto.tasks;

import co.com.yrm.qa.proyecto.userinterfaces.InciarSesionPage;
import co.com.yrm.qa.proyecto.utils.Constant;
import co.com.yrm.qa.proyecto.utils.ShadowRootWithSelector;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
public class IniciarSesion implements Task {

    private ShadowRootWithSelector shadowRootWithSelector;

    @Override
    public <T extends Actor> void performAs(T actor) {
        shadowRootWithSelector.type(InciarSesionPage.SHADOW_SELECTOR_TXT_LOGIN,InciarSesionPage.TXT_USUARIO.getCssOrXPathSelector(), Constant.USUARIO);
        shadowRootWithSelector.type(InciarSesionPage.SHADOW_SELECTOR_TXT_CLAVE.getCssOrXPathSelector(),InciarSesionPage.TXT_CLAVE.getCssOrXPathSelector(),Constant.CLAVE);
        actor.attemptsTo(Click.on(InciarSesionPage.BTN_INGRESAR));
    }

    public static IniciarSesion enPortal() {
        return Tasks.instrumented(IniciarSesion.class);
    }
}
