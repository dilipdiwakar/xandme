package com.xandme.springbootquickstart.googleapi.model;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import org.codehaus.jackson.annotate.*;

import java.util.HashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "country",
        "viewability",
        "embeddable",
        "publicDomain",
        "textToSpeechPermission",
        "epub",
        "pdf",
        "webReaderLink",
        "accessViewStatus",
        "quoteSharingAllowed"
})
public class AccessInfo {

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
     * The Viewability Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("viewability")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String viewability = "";
    /**
     * The Embeddable Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("embeddable")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean embeddable = false;
    /**
     * The Publicdomain Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("publicDomain")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean publicDomain = false;
    /**
     * The Texttospeechpermission Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("textToSpeechPermission")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String textToSpeechPermission = "";
    @JsonProperty("epub")
    private Epub epub;
    @JsonProperty("pdf")
    private Pdf pdf;
    /**
     * The Webreaderlink Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("webReaderLink")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String webReaderLink = "";
    /**
     * The Accessviewstatus Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("accessViewStatus")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String accessViewStatus = "";
    /**
     * The Quotesharingallowed Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("quoteSharingAllowed")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean quoteSharingAllowed = false;
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
     * The Viewability Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("viewability")
    public String getViewability() {
        return viewability;
    }

    /**
     * The Viewability Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("viewability")
    public void setViewability(String viewability) {
        this.viewability = viewability;
    }

    /**
     * The Embeddable Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("embeddable")
    public Boolean getEmbeddable() {
        return embeddable;
    }

    /**
     * The Embeddable Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("embeddable")
    public void setEmbeddable(Boolean embeddable) {
        this.embeddable = embeddable;
    }

    /**
     * The Publicdomain Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("publicDomain")
    public Boolean getPublicDomain() {
        return publicDomain;
    }

    /**
     * The Publicdomain Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("publicDomain")
    public void setPublicDomain(Boolean publicDomain) {
        this.publicDomain = publicDomain;
    }

    /**
     * The Texttospeechpermission Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("textToSpeechPermission")
    public String getTextToSpeechPermission() {
        return textToSpeechPermission;
    }

    /**
     * The Texttospeechpermission Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("textToSpeechPermission")
    public void setTextToSpeechPermission(String textToSpeechPermission) {
        this.textToSpeechPermission = textToSpeechPermission;
    }

    @JsonProperty("epub")
    public Epub getEpub() {
        return epub;
    }

    @JsonProperty("epub")
    public void setEpub(Epub epub) {
        this.epub = epub;
    }

    @JsonProperty("pdf")
    public Pdf getPdf() {
        return pdf;
    }

    @JsonProperty("pdf")
    public void setPdf(Pdf pdf) {
        this.pdf = pdf;
    }

    /**
     * The Webreaderlink Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("webReaderLink")
    public String getWebReaderLink() {
        return webReaderLink;
    }

    /**
     * The Webreaderlink Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("webReaderLink")
    public void setWebReaderLink(String webReaderLink) {
        this.webReaderLink = webReaderLink;
    }

    /**
     * The Accessviewstatus Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("accessViewStatus")
    public String getAccessViewStatus() {
        return accessViewStatus;
    }

    /**
     * The Accessviewstatus Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("accessViewStatus")
    public void setAccessViewStatus(String accessViewStatus) {
        this.accessViewStatus = accessViewStatus;
    }

    /**
     * The Quotesharingallowed Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("quoteSharingAllowed")
    public Boolean getQuoteSharingAllowed() {
        return quoteSharingAllowed;
    }

    /**
     * The Quotesharingallowed Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("quoteSharingAllowed")
    public void setQuoteSharingAllowed(Boolean quoteSharingAllowed) {
        this.quoteSharingAllowed = quoteSharingAllowed;
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
