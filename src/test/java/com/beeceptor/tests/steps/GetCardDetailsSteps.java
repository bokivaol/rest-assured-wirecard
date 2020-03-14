package com.beeceptor.tests.steps;

import com.beeceptor.tests.models.GetCardDetailsResponseModel;
import com.beeceptor.tests.models.PutRegisterUserResponseModel;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;

/**
 * Created by @Boki on Mar, 2020
 */
public class GetCardDetailsSteps {
    private Response response;

    public void callActiveCardDetails(){
        response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .get("user/bojan/card/4444333322221111")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log()
                .ifValidationFails()
                .extract()
                .response();
    }

    public void callLockedCardDetails(){
        response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .get("user/bojan/card/4444333322221112")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log()
                .ifValidationFails()
                .extract()
                .response();
    }

    public GetCardDetailsResponseModel SerializeGetCardDetailsResponse(){
        GetCardDetailsResponseModel putRespModel = response
                .then()
                .extract()
                .as(GetCardDetailsResponseModel.class);
        return putRespModel;
    }

    public Response getResponse() {
        return response;
    }
}
