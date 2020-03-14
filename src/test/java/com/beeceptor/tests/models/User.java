package com.beeceptor.tests.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by @Boki on Mart, 2020
 */
public class User {

    @SerializedName("birthDate")
    private String mBirthDate;
    @SerializedName("email")
    private String mEmail;
    @SerializedName("firstName")
    private String mFirstName;
    @SerializedName("lastName")
    private String mLastName;
    @SerializedName("loginName")
    private String mLoginName;
    @SerializedName("mobileNumber")
    private String mMobileNumber;
    @SerializedName("password")
    private String mPassword;
    @SerializedName("salutation")
    private String mSalutation;

    public String getBirthDate() {
        return mBirthDate;
    }

    public void setBirthDate(String birthDate) {
        mBirthDate = birthDate;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public String getLoginName() {
        return mLoginName;
    }

    public void setLoginName(String loginName) {
        mLoginName = loginName;
    }

    public String getMobileNumber() {
        return mMobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        mMobileNumber = mobileNumber;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

    public String getSalutation() {
        return mSalutation;
    }

    public void setSalutation(String salutation) {
        mSalutation = salutation;
    }

}
