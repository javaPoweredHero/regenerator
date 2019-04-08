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
    String name;

    @JacksonXmlProperty(localName = "company")
    String company;

    @JacksonXmlProperty(localName = "url")
    String url;

    @JacksonXmlProperty(localName = "platform")
    String platform;

    @JacksonXmlProperty(localName = "version")
    String version;

    @JacksonXmlProperty(localName = "enable_auto_discounts")
    Boolean enableAutoDiscounts;

    @JacksonXmlProperty(localName = "currencies")
    @JacksonXmlElementWrapper
    List<Currency> currencies;

    @JacksonXmlProperty(localName = "categories")
    @JacksonXmlElementWrapper
    List<Category> categories;

    @JacksonXmlProperty(localName = "offers")
    @JacksonXmlElementWrapper
    List<Offer> offers;
}
