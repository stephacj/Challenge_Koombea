package co.com.koombea.automation.android.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.koombea.automation.android.userinterfaces.ApplicationElementsPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ChooseThe implements Task {

    public static ChooseThe Operation(){
        return Tasks.instrumented(ChooseThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LENGTH_NUMBER)
        );

        actor.attemptsTo(
            WaitUntil.the(LENGTH_RESULT, isVisible()).forNoMoreThan(5).seconds(),
        Click.on(OPEN_NAVIGATION),
        Click.on(SELECT_AREA),
        Click.on(CLEAN_NUMBER),
        Click.on(AREA_NUMBER));

    }
}

   /* List<WebElement> buttons = driver.findElementsByClassName("android.widget.TextView");

for(WebElement button : buttons){
        System.out.println(button.getText());*/