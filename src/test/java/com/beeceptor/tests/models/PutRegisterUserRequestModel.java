
package com.beeceptor.tests.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by @Boki on Mar, 2020
 */
public class PutRegisterUserRequestModel {

    @SerializedName("user")
    private User mUser;

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

}
