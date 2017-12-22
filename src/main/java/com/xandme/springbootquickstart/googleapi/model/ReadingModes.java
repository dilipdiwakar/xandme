package com.xandme.springbootquickstart.googleapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import org.codehaus.jackson.annotate.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "text",
        "image"
})
public class ReadingModes {

    /**
     * The Text Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("text")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean text = false;
    /**
     * The Image Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("image")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean image = false;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Text Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("text")
    public Boolean getText() {
        return text;
    }

    /**
     * The Text Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("text")
    public void setText(Boolean text) {
        this.text = text;
    }

    /**
     * The Image Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("image")
    public Boolean getImage() {
        return image;
    }

    /**
     * The Image Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("image")
    public void setImage(Boolean image) {
        this.image = image;
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
