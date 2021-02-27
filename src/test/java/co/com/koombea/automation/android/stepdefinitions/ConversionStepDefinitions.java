package co.com.koombea.automation.android.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class ConversionStepDefinitions {

    @Given("^that (.*) wants to convert the dimensions$")
    public void that_Stephanie_wants_to_convert_the_dimensions() {

        OnStage.theActorCalled("Stephanie").wasAbleTo();

    }

    @When("^she enters$")
    public void she_enters(DataTable arg1) {

    }



    @Then("^you should see the conversion in the mobile application$")
    public void you_should_see_the_conversion_in_the_mobile_application() {

    }

}
