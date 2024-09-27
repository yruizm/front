package co.com.yrm.qa.proyecto.tasks;

import co.com.yrm.qa.proyecto.userinterfaces.PaginaPrincipalPage;
import co.com.yrm.qa.proyecto.utils.ShadowRootWithSelector;
import co.com.yrm.qa.proyecto.utils.Utils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class IngresarCrearCliente implements Task {

    private ShadowRootWithSelector shadowRootWithSelector;

    @Override
    public <T extends Actor> void performAs(T actor) {

        shadowRootWithSelector.click(PaginaPrincipalPage.SHADOW_SELECTOR_MENU.getCssOrXPathSelector(), PaginaPrincipalPage.BTN_CREAR.getCssOrXPathSelector());
        Utils.esperaExplicita(1000);
        shadowRootWithSelector.click(PaginaPrincipalPage.SHADOW_SELECTOR_MENU.getCssOrXPathSelector(), PaginaPrincipalPage.BTN_CLIENTES.getCssOrXPathSelector());
    }

    public static IngresarCrearCliente nuevoCliente() {
        return Tasks.instrumented(IngresarCrearCliente.class);
    }
}
