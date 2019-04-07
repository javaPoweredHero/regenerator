package com.regenerator.regenerator.data.yml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Category {

    @JacksonXmlProperty(localName = "id", isAttribute = true)
    Integer id;

    @JacksonXmlProperty(localName = "parentId", isAttribute = true)
    Integer parentId;

    @JacksonXmlText
    private String value;
}
