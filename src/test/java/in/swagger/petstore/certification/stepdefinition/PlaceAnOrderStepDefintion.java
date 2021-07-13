package in.swagger.petstore.certification.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.petstore.certification.models.PlaceAnOrderModel;
import io.swagger.petstore.certification.steps.PlaceAnOrderStep;
import io.swagger.petstore.certification.utils.InternetConection;
import net.thucydides.core.annotations.Steps;

import java.net.MalformedURLException;
import java.util.List;

public class PlaceAnOrderStepDefintion {


    @Steps
    PlaceAnOrderStep placeAnOrderStep;

    @Steps
    InternetConection internetConection;

    @Given("^que se consume el servicio$")
    public void queSeConsumeElServicio() throws MalformedURLException {
        internetConection.internetConection();
    }


    @When("^Compro la mascota$")
    public void comproLaMascota(List<PlaceAnOrderModel> listPlaceAnOrder) {
        placeAnOrderStep.PlaceAnOrderStep(listPlaceAnOrder.get(0).get_id(),
                                        listPlaceAnOrder.get(0).get_petId(),
                                        listPlaceAnOrder.get(0).get_quantity(),
                                        listPlaceAnOrder.get(0).get_shipDate(),
                                        listPlaceAnOrder.get(0).get_status(),
                                        listPlaceAnOrder.get(0).get_complete()
        );
    }

    @Then("^Se obtiene un codigo de respuesta (\\d+)$")
    public void seObtieneUnCodigoDeRespuesta(int statusCode) {
        placeAnOrderStep.verifyStatusCode(statusCode);
    }


}
