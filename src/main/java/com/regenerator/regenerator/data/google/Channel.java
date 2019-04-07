package com.regenerator.regenerator.data.google;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Channel {

    @JacksonXmlProperty(localName = "title")
    String title;

    @JacksonXmlProperty(localName = "link")
    String link;

    @JacksonXmlProperty(localName = "description")
    String description;

    @JacksonXmlProperty(localName = "item")
    @JacksonXmlElementWrapper(useWrapping = false)
    List<GoogleItem> googleItemList;
}
