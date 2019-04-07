package com.regenerator.regenerator.service.api;

import com.regenerator.regenerator.web.requests.ConvertationRequest;

public interface ConvertationService {

    boolean xmlToCsv(ConvertationRequest request);
}
