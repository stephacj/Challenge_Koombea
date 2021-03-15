package co.com.koombea.automation.android.stepdefinitions;

import co.com.koombea.automation.android.tasks.ChooseThe;
import co.com.koombea.automation.android.tasks.OpenThe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConversionStepDefinitions {



    @Given("^that (.*) wants to convert the dimensions$")
    public void that_Stephanie_wants_to_convert_the_dimensions(String Stephanie) {

      theActorCalled(Stephanie).wasAbleTo(OpenThe.preciseUnitConversionApp());

    }

        @When("^she enters")
        public void she_enters() {
       theActorInTheSpotlight().attemptsTo(ChooseThe.Operation());


    }

    @Then("^you should see the conversion in the mobile application$")
    public void you_should_see_the_conversion_in_the_mobile_application() {

    }


}
