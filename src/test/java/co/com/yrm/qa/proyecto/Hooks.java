package co.com.yrm.qa.proyecto;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {
    @Before
    public void doBefore(){
        OnStage.setTheStage(new OnlineCast());
    }
}
