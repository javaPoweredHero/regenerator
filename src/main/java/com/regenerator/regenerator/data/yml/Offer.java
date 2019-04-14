package com.regenerator.regenerator.data.yml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Offer {

    @JacksonXmlProperty(localName = "id", isAttribute = true)
    Integer id;

    @JacksonXmlProperty(localName = "available", isAttribute = true)
    Boolean available;

    @JacksonXmlProperty(localName = "group_id", isAttribute = true)
    Integer groupId;

    @JacksonXmlProperty(localName = "url")
    String url;

    @JacksonXmlProperty(localName = "price")
    String price;

    @JacksonXmlProperty(localName = "currencyId")
    String currencyId;

    @JacksonXmlProperty(localName = "categoryId")
    Integer categoryId;

    @JacksonXmlProperty(localName = "picture")
    @JacksonXmlElementWrapper(useWrapping = false)
    List<String> pictures;

    @JacksonXmlProperty(localName = "name")
    String name;

    @JacksonXmlProperty(localName = "modified_time")
    Long modifiedTime;

    @JacksonXmlProperty(localName = "vendor")
    String vendor;

    @JacksonXmlProperty(localName = "vendorCode")
    String vendorCode;

    @JacksonXmlProperty(localName = "country_of_origin")
    String countryOfOrigin;

    @JacksonXmlProperty(localName = "description")
    String description;
}
