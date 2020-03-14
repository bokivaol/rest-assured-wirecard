
package com.beeceptor.tests.models;


import com.google.gson.annotations.SerializedName;

/**
 * Created by @Boki on Mar, 2020
 */
public class GetCardDetailsResponseModel {

    @SerializedName("card")
    private Card mCard;

    public Card getCard() {
        return mCard;
    }

    public void setCard(Card card) {
        mCard = card;
    }

}
