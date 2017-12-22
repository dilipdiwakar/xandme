package com.xandme.springbootquickstart.googleapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import org.codehaus.jackson.annotate.*;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "title",
        "subtitle",
        "authors",
        "publisher",
        "publishedDate",
        "industryIdentifiers",
        "readingModes",
        "pageCount",
        "printType",
        "categories",
        "averageRating",
        "ratingsCount",
        "maturityRating",
        "allowAnonLogging",
        "contentVersion",
        "imageLinks",
        "language",
        "previewLink",
        "infoLink",
        "canonicalVolumeLink"
})
public class VolumeInfo {

    /**
     * The Title Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("title")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String title = "";
    /**
     * The Subtitle Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("subtitle")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String subtitle = "";
    @JsonProperty("authors")
    private List<String> authors = null;
    /**
     * The Publisher Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("publisher")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String publisher = "";
    /**
     * The Publisheddate Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("publishedDate")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String publishedDate = "";
    @JsonProperty("industryIdentifiers")
    private List<IndustryIdentifier> industryIdentifiers = null;
    @JsonProperty("readingModes")
    private ReadingModes readingModes;
    /**
     * The Pagecount Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("pageCount")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer pageCount = 0;
    /**
     * The Printtype Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("printType")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String printType = "";
    @JsonProperty("categories")
    private List<String> categories = null;
    /**
     * The Averagerating Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("averageRating")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer averageRating = 0;
    /**
     * The Ratingscount Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("ratingsCount")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer ratingsCount = 0;
    /**
     * The Maturityrating Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("maturityRating")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String maturityRating = "";
    /**
     * The Allowanonlogging Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("allowAnonLogging")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Boolean allowAnonLogging = false;
    /**
     * The Contentversion Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("contentVersion")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String contentVersion = "";
    @JsonProperty("imageLinks")
    private ImageLinks imageLinks;
    /**
     * The Language Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("language")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String language = "";
    /**
     * The Previewlink Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("previewLink")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String previewLink = "";
    /**
     * The Infolink Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("infoLink")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String infoLink = "";
    /**
     * The Canonicalvolumelink Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("canonicalVolumeLink")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String canonicalVolumeLink = "";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Title Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * The Title Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The Subtitle Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("subtitle")
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * The Subtitle Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("subtitle")
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("authors")
    public List<String> getAuthors() {
        return authors;
    }

    @JsonProperty("authors")
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    /**
     * The Publisher Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("publisher")
    public String getPublisher() {
        return publisher;
    }

    /**
     * The Publisher Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * The Publisheddate Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("publishedDate")
    public String getPublishedDate() {
        return publishedDate;
    }

    /**
     * The Publisheddate Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("publishedDate")
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @JsonProperty("industryIdentifiers")
    public List<IndustryIdentifier> getIndustryIdentifiers() {
        return industryIdentifiers;
    }

    @JsonProperty("industryIdentifiers")
    public void setIndustryIdentifiers(List<IndustryIdentifier> industryIdentifiers) {
        this.industryIdentifiers = industryIdentifiers;
    }

    @JsonProperty("readingModes")
    public ReadingModes getReadingModes() {
        return readingModes;
    }

    @JsonProperty("readingModes")
    public void setReadingModes(ReadingModes readingModes) {
        this.readingModes = readingModes;
    }

    /**
     * The Pagecount Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("pageCount")
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * The Pagecount Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("pageCount")
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * The Printtype Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("printType")
    public String getPrintType() {
        return printType;
    }

    /**
     * The Printtype Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("printType")
    public void setPrintType(String printType) {
        this.printType = printType;
    }

    @JsonProperty("categories")
    public List<String> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    /**
     * The Averagerating Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("averageRating")
    public Integer getAverageRating() {
        return averageRating;
    }

    /**
     * The Averagerating Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("averageRating")
    public void setAverageRating(Integer averageRating) {
        this.averageRating = averageRating;
    }

    /**
     * The Ratingscount Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("ratingsCount")
    public Integer getRatingsCount() {
        return ratingsCount;
    }

    /**
     * The Ratingscount Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("ratingsCount")
    public void setRatingsCount(Integer ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    /**
     * The Maturityrating Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("maturityRating")
    public String getMaturityRating() {
        return maturityRating;
    }

    /**
     * The Maturityrating Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("maturityRating")
    public void setMaturityRating(String maturityRating) {
        this.maturityRating = maturityRating;
    }

    /**
     * The Allowanonlogging Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("allowAnonLogging")
    public Boolean getAllowAnonLogging() {
        return allowAnonLogging;
    }

    /**
     * The Allowanonlogging Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("allowAnonLogging")
    public void setAllowAnonLogging(Boolean allowAnonLogging) {
        this.allowAnonLogging = allowAnonLogging;
    }

    /**
     * The Contentversion Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("contentVersion")
    public String getContentVersion() {
        return contentVersion;
    }

    /**
     * The Contentversion Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("contentVersion")
    public void setContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
    }

    @JsonProperty("imageLinks")
    public ImageLinks getImageLinks() {
        return imageLinks;
    }

    @JsonProperty("imageLinks")
    public void setImageLinks(ImageLinks imageLinks) {
        this.imageLinks = imageLinks;
    }

    /**
     * The Language Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * The Language Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * The Previewlink Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("previewLink")
    public String getPreviewLink() {
        return previewLink;
    }

    /**
     * The Previewlink Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("previewLink")
    public void setPreviewLink(String previewLink) {
        this.previewLink = previewLink;
    }

    /**
     * The Infolink Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("infoLink")
    public String getInfoLink() {
        return infoLink;
    }

    /**
     * The Infolink Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("infoLink")
    public void setInfoLink(String infoLink) {
        this.infoLink = infoLink;
    }

    /**
     * The Canonicalvolumelink Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("canonicalVolumeLink")
    public String getCanonicalVolumeLink() {
        return canonicalVolumeLink;
    }

    /**
     * The Canonicalvolumelink Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("canonicalVolumeLink")
    public void setCanonicalVolumeLink(String canonicalVolumeLink) {
        this.canonicalVolumeLink = canonicalVolumeLink;
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



/*
public class VolumeInfo {


   public String title;
    public String subtitle;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }



    public String toString(){
        return title + " " + subtitle;
    }
}

*/
