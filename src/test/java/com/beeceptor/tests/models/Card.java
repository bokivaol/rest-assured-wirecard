
package com.beeceptor.tests.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by @Boki on Mart, 2020
 */

public class Card {

    @SerializedName("holderName")
    private String mHolderName;
    @SerializedName("number")
    private String mNumber;
    @SerializedName("status")
    private String mStatus;

    public String getHolderName() {
        return mHolderName;
    }

    public void setHolderName(String holderName) {
        mHolderName = holderName;
    }

    public String getNumber() {
        return mNumber;
    }

    public void setNumber(String number) {
        mNumber = number;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

}
