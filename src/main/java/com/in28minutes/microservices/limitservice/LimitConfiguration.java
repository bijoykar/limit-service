package com.in28minutes.microservices.limitservice;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "limit-service")
public class LimitConfiguration {
    public String maxLimit;
    public String minLimit;
}
