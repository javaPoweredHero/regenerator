package com.regenerator.regenerator.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DataType {
    YML("yml_catalog"),
    GOOGLE("google_feed");

    private final String text;

    @JsonCreator
    public static DataType fromText(String text) {
        try {
            return DataType.valueOf(text);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

}
