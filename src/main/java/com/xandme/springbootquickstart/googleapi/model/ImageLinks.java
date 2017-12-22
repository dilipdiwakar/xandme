package com.xandme.springbootquickstart.googleapi.model;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import org.codehaus.jackson.annotate.*;

import java.util.HashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "smallThumbnail",
        "thumbnail"
})
public class ImageLinks {

    /**
     * The Smallthumbnail Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("smallThumbnail")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String smallThumbnail = "";
    /**
     * The Thumbnail Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("thumbnail")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String thumbnail = "";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Smallthumbnail Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("smallThumbnail")
    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    /**
     * The Smallthumbnail Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("smallThumbnail")
    public void setSmallThumbnail(String smallThumbnail) {
        this.smallThumbnail = smallThumbnail;
    }

    /**
     * The Thumbnail Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * The Thumbnail Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
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
