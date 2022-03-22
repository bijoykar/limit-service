package com.in28minutes.microservices.limitservice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LimitServiceModel {
    public String maxLimit;
    public String minLimit;

    public LimitServiceModel(String maxLimit, String minLimit) {
        this.maxLimit = maxLimit;
        this.minLimit = minLimit;
    }
}
