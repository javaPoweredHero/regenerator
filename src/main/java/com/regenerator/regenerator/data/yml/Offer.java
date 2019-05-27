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
    String id;

    @JacksonXmlProperty(localName = "available", isAttribute = true)
    Boolean available;

    @JacksonXmlProperty(localName = "group_id", isAttribute = true)
    String groupId;

    @JacksonXmlProperty(localName = "url")
    String url;

    @JacksonXmlProperty(localName = "price")
    String price;

    @JacksonXmlProperty(localName = "currencyId")
    String currencyId;

    @JacksonXmlProperty(localName = "categoryId")
    String categoryId;

    @JacksonXmlProperty(localName = "picture")
    @JacksonXmlElementWrapper(useWrapping = false)
    List<String> pictures;

    @JacksonXmlProperty(localName = "pickup")
    Boolean pickup;

    @JacksonXmlProperty(localName = "delivery")
    Boolean delivery;

    @JacksonXmlProperty(localName = "name")
    String name;

    @JacksonXmlProperty(localName = "modified_time")
    String modifiedTime;

    @JacksonXmlProperty(localName = "vendor")
    String vendor;

    @JacksonXmlProperty(localName = "vendorCode")
    String vendorCode;

    @JacksonXmlProperty(localName = "country_of_origin")
    String countryOfOrigin;

    @JacksonXmlProperty(localName = "description")
    String description;
}
