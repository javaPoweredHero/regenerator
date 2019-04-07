package com.regenerator.regenerator.data.google;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class GoogleRss {

    @JacksonXmlProperty(localName = "version", isAttribute = true)
    String version;

    @JacksonXmlElementWrapper(localName = "channel")
    Channel channel;
}
