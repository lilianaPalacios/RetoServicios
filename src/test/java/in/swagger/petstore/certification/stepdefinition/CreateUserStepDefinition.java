package in.swagger.petstore.certification.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.petstore.certification.models.UserModel;
import io.swagger.petstore.certification.steps.CreateUserStep;
import io.swagger.petstore.certification.utils.InternetConection;
import net.thucydides.core.annotations.Steps;

import java.net.MalformedURLException;
import java.util.List;

public class CreateUserStepDefinition {

    @Steps
    CreateUserStep createUserStep;

    //@Steps
    //InternetConection internetConection;
    @Given("^se verifica la conexion a internet$")
    public void seVerificaLaConexionAInternet() throws MalformedURLException {
       // internetConection.internetConection();
    }


    @When("^El usuario ingresa los datos solicitados por el servicio$")
    public void elUsuarioIngresaLosDatosSolicitadosPorElServicio(List<UserModel> userModel) {
        createUserStep.createUser(
                userModel.get(0).get_id(),
                userModel.get(0).get_UserName(),
                userModel.get(0).get_firstName(),
                userModel.get(0).get_lastName(),
                userModel.get(0).get_email(),
                userModel.get(0).get_password(),
                userModel.get(0).get_phone(),
                userModel.get(0).get_userStatus()
        );
    }

    @Then("^El servicio responde un status code (\\d+)$")
    public void elServicioRespondeUnStatusCode(int statusCode) {
        createUserStep.verifyStatusCode(statusCode);
    }


}
