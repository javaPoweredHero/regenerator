package com.regenerator.regenerator.data.google;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class GoogleItem {
    @JacksonXmlProperty(localName = "title")
    String title;

    @JacksonXmlProperty(localName = "link")
    String link;

    @JacksonXmlProperty(localName = "id")
    String id;

    @JacksonXmlProperty(localName = "condition")
    String condition;

    @JacksonXmlProperty(localName = "price")
    String price;

    @JacksonXmlProperty(localName = "availability")
    String availability;

    @JacksonXmlProperty(localName = "image_link")
    String imageLink;

    @JacksonXmlProperty(localName = "shipping_weight")
    String shippingWeight;

    @JacksonXmlProperty(localName = "google_product_category")
    String googleProductCategory;

    @JacksonXmlProperty(localName = "identifier_exists")
    String identifierExists;

    @JacksonXmlProperty(localName = "description")
    String description;
}
