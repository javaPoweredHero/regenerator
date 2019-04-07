package com.regenerator.regenerator.service.impl;

import com.regenerator.regenerator.data.yml.Category;
import com.regenerator.regenerator.data.yml.Offer;
import com.regenerator.regenerator.data.yml.result.OfferResult;

import java.util.List;
import java.util.Objects;

public class OfferMapper {

    public static OfferResult toOfferResult(Offer offer, List<Category> categories) {
        String categoryName = categories.stream()
                .filter(category -> Objects.equals(category.getId(), offer.getCategoryId()))
                .map(Category::getValue)
                .findFirst()
                .orElse(null);
        return new OfferResult().setId(offer.getId())
                .setAvailable(offer.getAvailable())
                .setUrl(offer.getUrl())
                .setPrice(offer.getPrice())
                .setCurrencyId(offer.getCurrencyId())
                .setCategoryName(categoryName)
                .setPictures(offer.getPictures())
                .setName(offer.getName())
                .setVendor(offer.getVendor())
                .setVendorCode(offer.getVendorCode())
                .setDescription(offer.getDescription());
    }
}
