package com.beeceptor.tests;

import io.restassured.RestAssured;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.mapper.ObjectMapperType;
import org.testng.annotations.BeforeClass;

/**
 * Created by @Boki on Mar, 2020
 */
public class BaseApiTest {

    @BeforeClass
    public void setup() {
//		Needed not to check SSL cert
        RestAssured.useRelaxedHTTPSValidation();
//		GSON over Jackson
        RestAssured.given().config(RestAssuredConfig.config().objectMapperConfig(new ObjectMapperConfig(ObjectMapperType.GSON)));

        RestAssured.baseURI = "https://wirecard.free.beeceptor.com";
    }

}
