package com.regenerator.regenerator.web;

import com.regenerator.regenerator.configuration.Urls;
import com.regenerator.regenerator.data.DataType;
import com.regenerator.regenerator.service.api.ConvertationService;
import com.regenerator.regenerator.web.requests.ConvertationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(path = Urls.FileInputController.FULL)
@RequiredArgsConstructor
public class FileInputController {

    @Autowired
    ConvertationService convertationService;

    private final String OK_RESPONSE = "ok.input regeneration succeed.";
    private final String BAD_RESPONSE = "fail. regeneration failure. check your input";

    @PostMapping(path = Urls.FileInputController.CreateTask.PART)
    public ResponseEntity<String> createConvertationTask(@Valid @RequestBody ConvertationRequest request) {
        if (convertationService.xmlToCsv(request)) {
            return new ResponseEntity<>(OK_RESPONSE, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(BAD_RESPONSE, HttpStatus.BAD_REQUEST);
        }
    }
}
