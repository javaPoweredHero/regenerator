package com.regenerator.regenerator.data.yml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Currency {

    @JacksonXmlProperty(localName = "id", isAttribute = true)
    String id;

    @JacksonXmlProperty(localName = "rate", isAttribute = true)
    Integer rate;
}
