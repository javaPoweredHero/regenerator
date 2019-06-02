package com.regenerator.regenerator.data.yml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.regenerator.regenerator.data.yml.Category;
import com.regenerator.regenerator.data.yml.Currency;
import com.regenerator.regenerator.data.yml.Offer;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Shop {

    @JacksonXmlProperty(localName = "name")
    private String name;

    @JacksonXmlProperty(localName = "company")
    private String company;

    @JacksonXmlProperty(localName = "url")
    private String url;

    @JacksonXmlProperty(localName = "platform")
    private String platform;

    @JacksonXmlProperty(localName = "version")
    private String version;

    @JacksonXmlProperty(localName = "enable_auto_discounts")
    private Boolean enableAutoDiscounts;

    @JacksonXmlProperty(localName = "currencies")
    @JacksonXmlElementWrapper
    private List<Currency> currencies;

    @JacksonXmlProperty(localName = "categories")
    @JacksonXmlElementWrapper
    private List<Category> categories;

    @JacksonXmlProperty(localName = "offers")
    @JacksonXmlElementWrapper
    private List<Offer> offers;
}
