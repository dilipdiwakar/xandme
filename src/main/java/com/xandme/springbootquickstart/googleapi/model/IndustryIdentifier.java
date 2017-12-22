package com.xandme.springbootquickstart.googleapi.model;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import org.codehaus.jackson.annotate.*;

import java.util.HashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "identifier"
})
public class IndustryIdentifier {

    /**
     * The Type Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("type")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String type = "";
    /**
     * The Identifier Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("identifier")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String identifier = "";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Type Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The Type Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The Identifier Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    /**
     * The Identifier Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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
