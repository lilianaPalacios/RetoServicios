package io.swagger.petstore.certification.steps;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import java.util.Map;

import static io.swagger.petstore.certification.utils.enums.URLReqRes.URI_BASE;
import static io.swagger.petstore.certification.utils.enums.URLReqRes.URI_SUFFIX_PlOrder;

public class PlaceAnOrderStep {

    private Map<String,Object> jsonMap = new HashMap<>();
    Response response;

    @Step
    public void PlaceAnOrderStep(String id, String petId, String quantity, String shipDate, String status,String complete){

        jsonMap.put("id",id);
        jsonMap.put("petId",petId);
        jsonMap.put("quantity",quantity);
        jsonMap.put("shipDate",shipDate);
        jsonMap.put("status",status);
        jsonMap.put("complete",complete);

        response = SerenityRest.given()
                .contentType("application/json")
                .baseUri(URI_BASE.getValue())
                .basePath(URI_SUFFIX_PlOrder.getValue())
                .content(jsonMap).log().body()
                .when().post();
    }

    @Step
    public void verifyStatusCode (int statusCode){
        SerenityRest.lastResponse().then().assertThat().statusCode(statusCode);
    }

}
