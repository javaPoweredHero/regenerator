package com.regenerator.regenerator.data.yml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "yml_catalog")
@JsonIgnoreProperties(ignoreUnknown = true)
public class YmlCatalog {
    @JacksonXmlProperty(isAttribute = true, localName = "date")
    private String date;

    @JacksonXmlProperty(localName = "shop")
    private Shop shop;
}

