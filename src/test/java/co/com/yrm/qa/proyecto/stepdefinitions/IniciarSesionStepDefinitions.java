package co.com.yrm.qa.proyecto.stepdefinitions;


import co.com.yrm.qa.proyecto.interactions.NavigateTo;
import co.com.yrm.qa.proyecto.tasks.IniciarSesion;
import co.com.yrm.qa.proyecto.utils.Constant;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarSesionStepDefinitions {

	@Before
	public void doBefore(){
		OnStage.setTheStage(new OnlineCast());
	}
	@Dado("el ingreso al sitio web siigo")
	public void elIngresoAlSitioWeb() {
		theActorCalled(Constant.ACTOR_NAME).wasAbleTo(NavigateTo.siigo());
	}

	@Entonces("ingrese las crendeciales para loguearme")
	public void ingreseLasCrendecialesParaLoguearme() {
		theActorInTheSpotlight().attemptsTo(IniciarSesion.enPortal());
	}

}
