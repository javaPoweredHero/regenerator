package com.regenerator.regenerator.utils;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CsvSchemaFactory {

    private final char COLUMN_SEPARATOR = ';';
    private final String LINE_SEPARATOR = "%sbg7a%";

    public CsvSchema buildCsvSchema(CsvMapper csvMapper, Class clazz) {
        return csvMapper.schemaFor(clazz)
                .withColumnSeparator(COLUMN_SEPARATOR)
                .withHeader()
                .withLineSeparator(LINE_SEPARATOR);
    }
}
