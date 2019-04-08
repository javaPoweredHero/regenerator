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

    @JacksonXmlProperty(namespace = "g", localName = "id")
    String id;

    @JacksonXmlProperty(namespace = "g", localName = "condition")
    String condition;

    @JacksonXmlProperty(namespace = "g", localName = "price")
    String price;

    @JacksonXmlProperty(namespace = "g", localName = "availability")
    String availability;

    @JacksonXmlProperty(namespace = "g", localName = "image_link")
    String imageLink;

    @JacksonXmlProperty(namespace = "g", localName = "shipping_weight")
    String shippingWeight;

    @JacksonXmlProperty(namespace = "g", localName = "google_product_category")
    String googleProductCategory;

    @JacksonXmlProperty(namespace = "g", localName = "identifier_exists")
    String identifierExists;

    @JacksonXmlProperty(localName = "description")
    String description;
}
