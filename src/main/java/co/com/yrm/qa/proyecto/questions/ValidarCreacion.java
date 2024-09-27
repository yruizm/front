package co.com.yrm.qa.proyecto.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import java.util.List;

public class ValidarCreacion implements Question<Boolean> {


    public ValidarCreacion(List<String> data) {


    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return false;
    }


    public static ValidarCreacion filtrarHotel(List<String> data){
        return new ValidarCreacion(data);
    }

}
