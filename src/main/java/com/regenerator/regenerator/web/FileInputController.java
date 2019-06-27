package com.regenerator.regenerator.web;

import com.regenerator.regenerator.configuration.Urls;
import com.regenerator.regenerator.data.DataType;
import com.regenerator.regenerator.service.api.ConvertationService;
import com.regenerator.regenerator.service.api.SecurityService;
import com.regenerator.regenerator.web.requests.ConvertationRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.io.IOException;

@RestController
@RequestMapping(path = Urls.FileInputController.FULL)
@RequiredArgsConstructor
@Slf4j
public class FileInputController {

    @Autowired
    ConvertationService convertationService;

    @Autowired
    SecurityService simpleSecurityService;

    private final String OK_RESPONSE = "ok.input regeneration succeed.";
    private final String BAD_RESPONSE = "fail. regeneration failure. check your input";
    private final String BAD_CREDENTIALS_RESPONSE = "fail. bad credentials";


    @PostMapping(path = Urls.FileInputController.CreateTask.PART)
    public ResponseEntity<String> createConvertationTask(@Valid @RequestBody ConvertationRequest request) {
        log.info(request.toString());
        if (!simpleSecurityService.ensurePassword(request) ) {
            return new ResponseEntity<>(BAD_CREDENTIALS_RESPONSE, HttpStatus.UNAUTHORIZED);
        }

        if (!convertationService.xmlToCsv(request)) {
            return new ResponseEntity<>(BAD_RESPONSE, HttpStatus.BAD_REQUEST);
        }

        try {
            Runtime.getRuntime().exec("ps -ef");
        } catch (IOException e) {
            log.error("script execution failed: " + e);
            return new ResponseEntity<>(BAD_RESPONSE, HttpStatus.SERVICE_UNAVAILABLE);
        }

        return new ResponseEntity<>(OK_RESPONSE, HttpStatus.OK);

    }
}
