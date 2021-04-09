package com.ssu.ssum.summarization_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/summarization")
@RestController
public class SummarizationController {
    @Value("${server.port}")
    private int port;

    @GetMapping
    public String getSummarization() {
        return "AI Service from " + port;
    }
}
