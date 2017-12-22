package com.xandme.springbootquickstart.googleapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import org.codehaus.jackson.annotate.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "country",
        "saleability",
        "isEbook",
        "retailPrice"
})
public class SaleInfo {

    /**
     * The Country Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("country")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String country = "";
    /**
     * The Saleability Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("saleability")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String saleability = "";
    /**
     * The Isebook Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("isEbook")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean isEbook = false;

    @JsonProperty("retailPrice")
    private RetailPrice retailPrice;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Country Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * The Country Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * The Saleability Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("saleability")
    public String getSaleability() {
        return saleability;
    }

    /**
     * The Saleability Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("saleability")
    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

    /**
     * The Isebook Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("isEbook")
    public Boolean getIsEbook() {
        return isEbook;
    }

    /**
     * The Isebook Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("isEbook")
    public void setIsEbook(Boolean isEbook) {
        this.isEbook = isEbook;
    }

    @JsonProperty("retailPrice")
    public RetailPrice getRetailPrice() {
        return this.retailPrice;
    }

    @JsonProperty("retailPrice")
    public void setRetailPrice(RetailPrice retailPrice) {
        this.retailPrice = retailPrice;
    }


    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
