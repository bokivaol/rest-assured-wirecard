package com.beeceptor.tests.steps;

import com.beeceptor.tests.models.PutRegisterUserRequestModel;
import com.beeceptor.tests.models.PutRegisterUserResponseModel;
import com.beeceptor.tests.models.User;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;

/**
 * Created by @Boki on Mar, 2020
 */
public class PutRegisterUserSteps {
    private Response response;

    public void callRegisterUser(PutRegisterUserRequestModel bodyPayload){
        response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .body(bodyPayload)
                .put("/user")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log()
                .ifValidationFails()
                .extract()
                .response();
    }

    public PutRegisterUserResponseModel SerializePutUpdateResponse(){
        PutRegisterUserResponseModel putRespModel = response
                .then()
                .extract()
                .as(PutRegisterUserResponseModel.class);
        return putRespModel;
    }

    public Response getResponse() {
        return response;
    }
}
