package com.xandme.springbootquickstart.googleapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import org.codehaus.jackson.annotate.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "amount",
        "currencyCode"
})
public class RetailPrice {

    private static final double DEFAULT=0;

    /**
     * The Country Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private double amount = 0;
    /**
     * The Saleability Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("currencyCode")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String currencyCode = "";

    /**
     * The Country Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("amount")
    public double getAmount() {
        return amount;
    }

    /**
     * The Country Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("amount")
    public void setAmount(double amount) {
            this.amount=amount;
    }


    /**
     * The Saleability Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * The Saleability Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

}
