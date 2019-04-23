package com.regenerator.regenerator.service.impl;

import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.regenerator.regenerator.data.google.GoogleItem;
import com.regenerator.regenerator.data.google.GoogleRss;
import com.regenerator.regenerator.data.yml.Offer;
import com.regenerator.regenerator.data.yml.Shop;
import com.regenerator.regenerator.data.yml.YmlCatalog;
import com.regenerator.regenerator.data.yml.result.OfferResult;
import com.regenerator.regenerator.service.api.ConvertationService;
import com.regenerator.regenerator.utils.CsvSchemaFactory;
import com.regenerator.regenerator.web.requests.ConvertationRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ConvertationServiceImpl implements ConvertationService {

    @Override
    public boolean xmlToCsv(ConvertationRequest request) {
        if (request == null) {
            return false;
        }

        XmlMapper xmlMapper = new XmlMapper();
        CsvMapper csvMapper = new CsvMapper();
        File inputfile = new File(request.getInputFilePath());

        if (!inputfile.exists() || !inputfile.canRead()) {
            return false;
        }

        File outputfile = new File(request.getOutputFilePath());

        try (
                BufferedReader br = Files.newBufferedReader(inputfile.toPath());
                BufferedWriter bw = Files.newBufferedWriter(outputfile.toPath())
        ) {
            switch (request.getDataType()) {
                case YML:
                    convertYmlCatalog(br, bw, xmlMapper, csvMapper);
                    break;
                case GXML:
                    convertGoogleFeed(br, bw, xmlMapper, csvMapper);
                    break;
                default:
                    return false;
            }
        } catch (IOException ex) {
            log.error("conversion failed: " + ex);
            return false;
        }

        return true;
    }

    private void convertYmlCatalog(BufferedReader input, BufferedWriter output, XmlMapper xmlMapper, CsvMapper csvMapper)
            throws IOException {
        YmlCatalog ymlCatalog = xmlMapper.readValue(input, YmlCatalog.class);
        ObjectWriter writer = csvMapper.writer(CsvSchemaFactory.buildCsvSchema(csvMapper, OfferResult.class));
        List<Offer> offers = Optional.ofNullable(ymlCatalog)
                .map(YmlCatalog::getShop)
                .map(Shop::getOffers)
                .orElse(Collections.emptyList());

        writer.writeValues(output).writeAll(offers.stream()
                .map(offer -> OfferMapper.toOfferResult(offer, ymlCatalog.getShop().getCategories()))
                .collect(Collectors.toList()));
    }

    private void convertGoogleFeed(BufferedReader input, BufferedWriter output, XmlMapper xmlMapper, CsvMapper csvMapper)
            throws IOException {
        GoogleRss googleFeed = xmlMapper.readValue(input, GoogleRss.class);
        ObjectWriter writer = csvMapper.writer(CsvSchemaFactory.buildCsvSchema(csvMapper, GoogleItem.class));

        if (googleFeed != null && googleFeed.getChannel() != null) {
            writer.writeValues(output).writeAll(googleFeed.getChannel().getGoogleItemList());
        }
    }
}
