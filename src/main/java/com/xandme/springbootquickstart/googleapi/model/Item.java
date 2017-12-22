package com.xandme.springbootquickstart.googleapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import org.codehaus.jackson.annotate.*;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "kind",
        "id",
        "etag",
        "selfLink",
        "volumeInfo",
        "saleInfo",
        "accessInfo"
})
public class Item {

    /**
     * The Kind Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("kind")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String kind = "";
    /**
     * The Id Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("id")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String id = "";
    /**
     * The Etag Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("etag")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String etag = "";
    /**
     * The Selflink Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("selfLink")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String selfLink = "";
    @JsonProperty("volumeInfo")
    private VolumeInfo volumeInfo;
    @JsonProperty("saleInfo")
    private SaleInfo saleInfo;
    @JsonProperty("accessInfo")
    private AccessInfo accessInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Kind Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * The Kind Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * The Id Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * The Id Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The Etag Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("etag")
    public String getEtag() {
        return etag;
    }

    /**
     * The Etag Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("etag")
    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     * The Selflink Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("selfLink")
    public String getSelfLink() {
        return selfLink;
    }

    /**
     * The Selflink Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("selfLink")
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    @JsonProperty("volumeInfo")
    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    @JsonProperty("volumeInfo")
    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    @JsonProperty("saleInfo")
    public SaleInfo getSaleInfo() {
        return saleInfo;
    }

    @JsonProperty("saleInfo")
    public void setSaleInfo(SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    @JsonProperty("accessInfo")
    public AccessInfo getAccessInfo() {
        return accessInfo;
    }

    @JsonProperty("accessInfo")
    public void setAccessInfo(AccessInfo accessInfo) {
        this.accessInfo = accessInfo;
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
