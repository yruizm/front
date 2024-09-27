package co.com.yrm.qa.proyecto.stepdefinitions;

import co.com.yrm.qa.proyecto.tasks.IngresarCrearCliente;
import io.cucumber.java.es.Dado;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HomeStepDefinitions {
    @Dado("accede a la opcion clientes en el menu")
    public void accedeALaOpcionClientesEnElMenu() {
        theActorInTheSpotlight().attemptsTo(IngresarCrearCliente.nuevoCliente());
    }
}
