package com.regenerator.regenerator.web.requests;

import com.regenerator.regenerator.data.DataType;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Accessors(chain = true)
public class ConvertationRequest {

    @NotBlank
    private String inputFilePath;

    @NotBlank
    private String outputFilePath;

    @NotNull
    private DataType dataType;

    private String password;
}

