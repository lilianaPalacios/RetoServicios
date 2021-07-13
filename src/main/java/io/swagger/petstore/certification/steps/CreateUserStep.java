package io.swagger.petstore.certification.steps;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import java.util.Map;

import static io.swagger.petstore.certification.utils.enums.URLReqRes.URI_BASE;
import static io.swagger.petstore.certification.utils.enums.URLReqRes.URI_SUFFIX_USERS;

public class CreateUserStep {

    private Map<String,Object> jsonMap = new HashMap<>();
    private Response response;

    @Step
    public void createUser(String id, String userName,String firstName,String lastName, String email,String pass,
                           String phone,String userStatus){

        jsonMap.put("id",id);
        jsonMap.put("username",userName);
        jsonMap.put("firstName",firstName);
        jsonMap.put("lastName",lastName);
        jsonMap.put("email",email);
        jsonMap.put("password",pass);
        jsonMap.put("phone",phone);
        jsonMap.put("userStatus",userStatus);

        response = SerenityRest.given()
                .contentType("application/json")
                .baseUri(URI_BASE.getValue())
                .basePath(URI_SUFFIX_USERS.getValue())
                .content(jsonMap).log().body()
                .when().post();

    }

    @Step

    public void verifyStatusCode(int statusCode){
        SerenityRest.lastResponse().then().assertThat().statusCode(statusCode);
    }

}
