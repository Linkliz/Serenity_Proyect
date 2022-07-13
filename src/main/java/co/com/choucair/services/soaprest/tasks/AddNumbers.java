package co.com.choucair.services.soaprest.tasks;

import co.com.choucair.services.soaprest.interactions.ConsumeService;
import co.com.choucair.services.soaprest.model.ModelAddNumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class AddNumbers implements Task {

    private List<ModelAddNumber> modelAddNumbers;

    public AddNumbers(List<ModelAddNumber> modelAddNumbers) {
        this.modelAddNumbers = modelAddNumbers;
    }

    public static AddNumbers with(List<ModelAddNumber> modelAddNumbers) {
        return Tasks.instrumented(AddNumbers.class, modelAddNumbers);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.with(modelAddNumbers.get(0).toString()));
    }
}
