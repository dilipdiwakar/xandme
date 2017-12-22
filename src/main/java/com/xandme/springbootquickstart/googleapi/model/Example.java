package com.xandme.springbootquickstart.googleapi.model;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import org.codehaus.jackson.annotate.*;

import java.util.HashMap;
import java.util.Map;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "kind",
        "totalItems",
        "items"
})
public class Example {

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
     * The Totalitems Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("totalItems")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer totalItems = 0;
    @JsonProperty("items")
    private List<Item> items = null;
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
     * The Totalitems Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("totalItems")
    public Integer getTotalItems() {
        return totalItems;
    }

    /**
     * The Totalitems Schema.
     * <p>
     * An explanation about the purpose of this instance.
     *
     */
    @JsonProperty("totalItems")
    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
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
