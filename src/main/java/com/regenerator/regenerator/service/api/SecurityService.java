package com.regenerator.regenerator.service.api;

import com.regenerator.regenerator.web.requests.ConvertationRequest;

public interface SecurityService {

    boolean ensurePassword(ConvertationRequest request);
}
