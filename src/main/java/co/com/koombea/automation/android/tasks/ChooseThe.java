package co.com.koombea.automation.android.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ChooseThe implements Task {

    public static ChooseThe Operarion(){
        return Tasks.instrumented(ChooseThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
