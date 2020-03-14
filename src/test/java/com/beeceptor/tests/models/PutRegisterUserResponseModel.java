
package com.beeceptor.tests.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by @Boki on Mart, 2020
 */
public class PutRegisterUserResponseModel {

    @SerializedName("register-user-response")
    private RegisterUserResponse mRegisterUserResponse;

    public RegisterUserResponse getRegisterUserResponse() {
        return mRegisterUserResponse;
    }

    public void setRegisterUserResponse(RegisterUserResponse registerUserResponse) {
        mRegisterUserResponse = registerUserResponse;
    }

}
