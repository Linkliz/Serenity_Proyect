package co.com.choucair.services.soaprest.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

public class ConsumeService {

    private ConsumeService() {
    }

    public static WithPost withPost(String body){
        return Tasks.instrumented(WithPost.class,body);
    }
    public static Whit with(String body) {return Tasks.instrumented(Whit.class,body);}
}
