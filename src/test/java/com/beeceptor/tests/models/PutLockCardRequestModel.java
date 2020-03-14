
package com.beeceptor.tests.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by @Boki on Mar, 2020
 */
public class PutLockCardRequestModel {

    @SerializedName("cardLock")
    private CardLock mCardLock;

    public CardLock getCardLock() {
        return mCardLock;
    }

    public void setCardLock(CardLock cardLock) {
        mCardLock = cardLock;
    }

}
