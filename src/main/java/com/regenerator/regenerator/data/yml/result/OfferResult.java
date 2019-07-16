package com.regenerator.regenerator.data.yml.result;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OfferResult {
    String id;
    String available;
    String url;
    String price;
    String oldPrice;
    String currencyId;
    String categoryName;
    List<String> pictures;
    String name;
    String vendor;
    String vendorCode;
    String description;
    String groupId;
    String model;
    String weight;
    String stockQuantity;
    List<String> paramNameValueStringList;
}
