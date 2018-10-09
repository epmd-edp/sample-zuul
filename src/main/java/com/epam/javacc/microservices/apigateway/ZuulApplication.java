package com.epam.javacc.microservices.apigateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import java.util.Arrays;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {

    public static void main(String[] args) {
        Arrays.asList(1, 2).forEach(System.out::println);
        new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
    }
}
