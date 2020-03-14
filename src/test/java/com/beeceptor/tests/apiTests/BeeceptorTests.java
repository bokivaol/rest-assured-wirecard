package com.beeceptor.tests.apiTests;

import com.beeceptor.tests.models.*;
import com.beeceptor.tests.steps.*;
import com.beeceptor.tests.BaseApiTest;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

/**
 * Created by @Boki on Jan, 2020
 */
public class BeeceptorTests extends BaseApiTest {

    @Test
    public void getActiveCardDetils(){
        SoftAssertions softAssertions = new SoftAssertions();

        GetCardDetailsSteps cardDetails = new GetCardDetailsSteps();
        cardDetails.callActiveCardDetails();
        GetCardDetailsResponseModel responseModel = cardDetails.SerializeGetCardDetailsResponse();

        softAssertions.assertThat(cardDetails.getResponse().getStatusCode()).as("Status code is 200.")
                .isEqualTo(200);
        softAssertions.assertThat(responseModel.getCard().getHolderName()).as("Holder name")
                .isEqualTo("John Smith");
        softAssertions.assertThat(responseModel.getCard().getNumber()).as("Card number")
                .isEqualTo("4444333322221111");
        softAssertions.assertThat(responseModel.getCard().getStatus()).as("Card status")
                .isEqualTo("ACTIVE");

        softAssertions.assertAll();
    }

    @Test
    public void getLockedCardDetils(){
        SoftAssertions softAssertions = new SoftAssertions();

        GetCardDetailsSteps cardDetails = new GetCardDetailsSteps();
        cardDetails.callLockedCardDetails();
        GetCardDetailsResponseModel responseModel = cardDetails.SerializeGetCardDetailsResponse();

        softAssertions.assertThat(cardDetails.getResponse().getStatusCode()).as("Status code is 200.")
                .isEqualTo(200);
        softAssertions.assertThat(responseModel.getCard().getHolderName()).as("Holder name")
                .isEqualTo("John Smith");
        softAssertions.assertThat(responseModel.getCard().getNumber()).as("Card number")
                .isEqualTo("4444******21112");
        softAssertions.assertThat(responseModel.getCard().getStatus()).as("Card status")
                .isEqualTo("LOCKED");

        softAssertions.assertAll();
    }

    @Test
    public void putRegisterUser(){
        SoftAssertions softAssertions = new SoftAssertions();

        PutRegisterUserRequestModel putRegisterUserRequestModel = new PutRegisterUserRequestModel();

        User createdUser = new User();
        createdUser.setSalutation("MR");
        createdUser.setFirstName("John");
        createdUser.setLastName("Smith");
        createdUser.setBirthDate("1992-09-24");
        createdUser.setMobileNumber("+491234567890");
        createdUser.setEmail("abc@def.co.de");
        createdUser.setLoginName("johnsmith1980");
        createdUser.setPassword("Johnny_1992");

        putRegisterUserRequestModel.setUser(createdUser);

        PutRegisterUserSteps registerUserSteps = new PutRegisterUserSteps();
        registerUserSteps.callRegisterUser(putRegisterUserRequestModel);

        PutRegisterUserResponseModel responseModel = registerUserSteps.SerializePutUpdateResponse();

        softAssertions.assertThat(registerUserSteps.getResponse().getStatusCode()).as("Status code is 200.")
                .isEqualTo(200);
        softAssertions.assertThat(responseModel.getRegisterUserResponse().getLoginName()).as("Login name")
                .isEqualTo("johnsmith1980");
        softAssertions.assertThat(responseModel.getRegisterUserResponse().getStatus()).as("User status")
                .isEqualTo("ACTIVE");
        softAssertions.assertThat(responseModel.getRegisterUserResponse().getPan()).as("Card PAN")
                .isEqualTo("4123456789012345");

        softAssertions.assertAll();
    }

    @Test
    public void putLockCard(){
        SoftAssertions softAssertions = new SoftAssertions();

        PutLockCardRequestModel putLockCardRequestModel = new PutLockCardRequestModel();

        CardLock cardLock = new CardLock();
        cardLock.setLockingReason("lost card");

        putLockCardRequestModel.setCardLock(cardLock);

        PutLockCardSteps lockCardSteps = new PutLockCardSteps();
        lockCardSteps.callLockCard(putLockCardRequestModel);

        PutLockCardResponseModel responseModel = lockCardSteps.SerializePutUpdateResponse();

        softAssertions.assertThat(lockCardSteps.getResponse().getStatusCode()).as("Status code is 200.")
                .isEqualTo(200);
        softAssertions.assertThat(responseModel.getStatus()).as("Card status")
                .isEqualTo("LOCKED");

        softAssertions.assertAll();
    }

}
