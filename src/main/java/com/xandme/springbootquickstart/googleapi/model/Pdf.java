package com.xandme.springbootquickstart.googleapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import org.codehaus.jackson.annotate.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "isAvailable"
})
public class Pdf {

    /**
     * The Isavailable Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("isAvailable")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean isAvailable = false;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Isavailable Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("isAvailable")
    public Boolean getIsAvailable() {
        return isAvailable;
    }

    /**
     * The Isavailable Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("isAvailable")
    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
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
