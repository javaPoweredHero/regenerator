package com.regenerator.regenerator.data.yml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "yml_catalog")
public class YmlCatalog {
    @JacksonXmlProperty(isAttribute = true, localName = "date")
    String date;

    @JacksonXmlProperty(localName = "shop")
    Shop shop;
}

