package com.beeceptor.tests.apiTests;

import com.beeceptor.tests.models.GetCardDetailsResponseModel;
import com.beeceptor.tests.steps.*;
import com.beeceptor.tests.BaseApiTest;
import io.restassured.response.Response;
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
//
//    @Test
//    public void T1_get_callAll100BlogPosts_all100BlogPostsAreReceivedInResponse() {
//        SoftAssertions softAssertions = new SoftAssertions();
//        GetPostsSteps getPostsSteps = new GetPostsSteps();
//
////        Run GET request
//        getPostsSteps.getPostsRequest();
//
////        Assertions starting point
//        softAssertions.assertThat(getPostsSteps.getResponse().getStatusCode()).as("Status code is 200.")
//                .isEqualTo(200);
//        softAssertions.assertThat(getPostsSteps.countAllPosts()).as("Number of blog posts").isEqualTo(100);
//
//        softAssertions.assertAll();
//    }
//
//    @Test
//    public void T1_get_callAll10BlogPostsWrittenByUserId5_all10BlogPostsWrittenByUserId5AreReceivedInResponse() {
//        int userId = 5;
//        SoftAssertions softAssertions = new SoftAssertions();
//        GetPostsByUserIdSteps getPostsByUserIdSteps = new GetPostsByUserIdSteps();
//
////        Run GET request
//        getPostsByUserIdSteps.getPostsByUserId(userId);
//
////        Assertions starting point
//        softAssertions.assertThat(getPostsByUserIdSteps.getResponse().getStatusCode()).as("Status code is 200.")
//                .isEqualTo(200);
////        Assertion that returned number of blog posts written by UserId=5 is 10
//        softAssertions.assertThat(getPostsByUserIdSteps.countAllPosts()).as("Number of blog posts written by user whose userID").isEqualTo(10);
//
//        softAssertions.assertAll();
//    }
//
//    @Test
//    public void T3_put_idInPostsBodyPayloadIsNumberAsStringNotAsInt_blogPostIsSuccessfullyUpdated() {
//        SoftAssertions softAssertions = new SoftAssertions();
//        PutUpdatePostSteps putUpdatePostSteps = new PutUpdatePostSteps();
//
////        Values of the payloadPostId and resourcePostId must be the same, but the data type is different.
//        String bodyPayloadPostId = "1";
//        int resourcePostId = 1;
//        int userId = 1;
//        String title = "Little";
//        String body = "Wing";
//
//
//
////        Assertions starting point
//        softAssertions.assertThat(putUpdatePostSteps.getResponse().getStatusCode()).as("Status code is 200.")
//                .isEqualTo(200);
//
//
//        softAssertions.assertAll();
//    }
//
//    @Test
//    public void T4_get_zeroAsBlogPostIdInResourceUri_statusCodeIs404AndEmptyJsonIsReceivedInResponse() {
//        SoftAssertions softAssertions = new SoftAssertions();
//        GetOnePostSteps getOnePostSteps = new GetOnePostSteps();
//
//        int resourcePostId = 0;
//
////        Run GET request
//        getOnePostSteps.getPostByPostId(resourcePostId);
//
//        Response response = getOnePostSteps.getResponse();
//
////        Assertions starting point
//        softAssertions.assertThat(response.getStatusCode()).as("Status code is 404.")
//                .isEqualTo(404);
//        softAssertions.assertThat(response.getBody().asString()).as("Body")
//                .isEqualTo("{}");
//
//        softAssertions.assertAll();
//    }
//
//
//    @Test
//    public void T5_put_updateDataUnderInvalidResourceId_userGetAnErrorMsgThatResourceIsNotFound() {
//        SoftAssertions softAssertions = new SoftAssertions();
//        PutUpdatePostSteps putUpdatePostSteps = new PutUpdatePostSteps();
//
////        Resource is letter.
//        String bodyPayloadPostId = "1";
//        String stringAsResourcePostId = "a";
//        int userId = 1;
//        String title = "Little";
//        String body = "Wing";
//
//
////        Assertions starting point
//        softAssertions.assertThat(putUpdatePostSteps.getResponse().getStatusCode()).as("Status code is 404.")
//                .isEqualTo(404);
//
//        softAssertions.assertAll();
//    }
}
