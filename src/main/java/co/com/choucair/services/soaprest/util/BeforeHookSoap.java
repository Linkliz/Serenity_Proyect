package co.com.choucair.services.soaprest.util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.com.choucair.services.soaprest.util.enums.SoapService.BASE_URL;

public class BeforeHookSoap {
    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Brandon").whoCan(CallAnApi.at(BASE_URL.toString()));
    }
}
