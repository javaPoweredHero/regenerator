package com.regenerator.regenerator.utils;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CsvSchemaFactory {

    public CsvSchema buildDefaultCsvSchema(CsvMapper csvMapper, Class clazz) {
        return csvMapper.schemaFor(clazz).withColumnSeparator(';').withHeader();
    }
}
