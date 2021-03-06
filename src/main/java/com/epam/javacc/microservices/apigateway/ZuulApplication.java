package com.epam.javacc.microservices.apigateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import java.util.Arrays;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {

    public static void main(String[] args) {
      
        new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
    }
}
