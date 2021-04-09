package com.ssu.ssum.summarization_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SummarizationServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SummarizationServiceApplication.class, args);
    }
}
