package com.regenerator.regenerator.data.google;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class GoogleItem {
    @JacksonXmlProperty(localName = "title")
    String title;

    @JacksonXmlProperty(localName = "link")
    String link;

    @JacksonXmlProperty(localName = "ads_redirect")
    String adsRedirect;

    @JacksonXmlProperty(localName = "id")
    String id;

    @JacksonXmlProperty(localName = "condition")
    String condition;

    @JacksonXmlProperty(localName = "price")
    String price;

    @JacksonXmlProperty(localName = "sale_price")
    String salePrice;

    @JacksonXmlProperty(localName = "availability")
    String availability;

    @JacksonXmlProperty(localName = "brand")
    String brand;

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

    @JacksonXmlProperty(localName = "additional_image_link")
    @JacksonXmlElementWrapper(useWrapping = false)
    List<String> additionalImageLinkList;
}
