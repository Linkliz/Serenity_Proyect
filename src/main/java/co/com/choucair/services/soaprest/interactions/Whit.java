package co.com.choucair.services.soaprest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static co.com.choucair.services.soaprest.util.enums.SoapService.ADD_NUMBERS;

public class Whit implements Interaction {

    private String body;

    public Whit(String body) {
        this.body = body;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(ADD_NUMBERS.toString())
                .with(request -> request
                        .headers("Content-Type", "text/xml")
                        .body(body)));
    }
}
