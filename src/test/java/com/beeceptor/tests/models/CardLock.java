
package com.beeceptor.tests.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by @Boki on Mart, 2020
 */
public class CardLock {

    @SerializedName("locking-reason")
    private String mLockingReason;

    public String getLockingReason() {
        return mLockingReason;
    }

    public void setLockingReason(String lockingReason) {
        mLockingReason = lockingReason;
    }

}
