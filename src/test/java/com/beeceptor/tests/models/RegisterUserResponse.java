
package com.beeceptor.tests.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by @Boki on Mart, 2020
 */
public class RegisterUserResponse {

    @SerializedName("loginName")
    private String mLoginName;
    @SerializedName("pan")
    private String mPan;
    @SerializedName("status")
    private String mStatus;

    public String getLoginName() {
        return mLoginName;
    }

    public void setLoginName(String loginName) {
        mLoginName = loginName;
    }

    public String getPan() {
        return mPan;
    }

    public void setPan(String pan) {
        mPan = pan;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

}
