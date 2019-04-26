package com.regenerator.regenerator.service.impl;

import com.regenerator.regenerator.service.api.SecurityService;
import com.regenerator.regenerator.web.requests.ConvertationRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class SimpleSecurityServiceImpl implements SecurityService {

    private final String password = "zer$563v[sax";

    @Override
    public boolean ensurePassword(ConvertationRequest request) {
        return request != null && password.equals(request.getPassword());
    }
}
