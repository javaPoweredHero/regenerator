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
    private String title;

    @JacksonXmlProperty(localName = "link")
    private String link;

    @JacksonXmlProperty(localName = "ads_redirect")
    private String adsRedirect;

    @JacksonXmlProperty(localName = "id")
    private String id;

    @JacksonXmlProperty(localName = "condition")
    private String condition;

    @JacksonXmlProperty(localName = "price")
    private String price;

    @JacksonXmlProperty(localName = "sale_price")
    private String salePrice;

    @JacksonXmlProperty(localName = "availability")
    private String availability;

    @JacksonXmlProperty(localName = "brand")
    private String brand;

    @JacksonXmlProperty(localName = "image_link")
    private String imageLink;

    @JacksonXmlProperty(localName = "shipping_weight")
    private String shippingWeight;

    @JacksonXmlProperty(localName = "google_product_category")
    private String googleProductCategory;

    @JacksonXmlProperty(localName = "gender")
    private String gender;

    @JacksonXmlProperty(localName = "color")
    private String color;

    @JacksonXmlProperty(localName = "size")
    private String size;

    @JacksonXmlProperty(localName = "item_group_id")
    private String itemGroupId;

    @JacksonXmlProperty(localName = "material")
    private String material;

    @JacksonXmlProperty(localName = "identifier_exists")
    private String identifierExists;

    @JacksonXmlProperty(localName = "description")
    private String description;

    @JacksonXmlProperty(localName = "additional_image_link")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<String> additionalImageLinkList;
}
