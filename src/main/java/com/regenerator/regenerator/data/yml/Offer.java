package com.regenerator.regenerator.data.yml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;

@Data
public class Offer {

    @JacksonXmlProperty(localName = "id", isAttribute = true)
    Integer id;

    @JacksonXmlProperty(localName = "available", isAttribute = true)
    Boolean available;

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

    @JacksonXmlProperty(localName = "vendor")
    String vendor;

    @JacksonXmlProperty(localName = "vendorCode")
    String vendorCode;

    @JacksonXmlProperty(localName = "description")
    String description;
}
