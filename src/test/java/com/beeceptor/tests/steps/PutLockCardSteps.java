package com.beeceptor.tests.steps;

import com.beeceptor.tests.models.PutLockCardRequestModel;
import com.beeceptor.tests.models.PutLockCardResponseModel;
import com.beeceptor.tests.models.PutRegisterUserRequestModel;
import com.beeceptor.tests.models.PutRegisterUserResponseModel;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;

/**
 * Created by @Boki on Mar, 2020
 */
public class PutLockCardSteps {
    private Response response;

    public void callLockCard(PutLockCardRequestModel bodyPayload){
        response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .body(bodyPayload)
                .put("/user/bojan/card/4444333322221111/lock/abcdefgh")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log()
                .ifValidationFails()
                .extract()
                .response();
    }

    public PutLockCardResponseModel SerializePutUpdateResponse(){
        PutLockCardResponseModel putRespModel = response
                .then()
                .extract()
                .as(PutLockCardResponseModel.class);
        return putRespModel;
    }

    public Response getResponse() {
        return response;
    }
}
