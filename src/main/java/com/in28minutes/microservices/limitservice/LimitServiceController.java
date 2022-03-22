package com.in28minutes.microservices.limitservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitServiceController {

    private final LimitConfiguration limitConfiguration;

    public LimitServiceController(LimitConfiguration limitConfiguration) {
        this.limitConfiguration = limitConfiguration;
    }

    @GetMapping(path = "/limit")
    public LimitServiceModel getLimit(){
        return new LimitServiceModel(limitConfiguration.maxLimit, limitConfiguration.minLimit);
    }
}
