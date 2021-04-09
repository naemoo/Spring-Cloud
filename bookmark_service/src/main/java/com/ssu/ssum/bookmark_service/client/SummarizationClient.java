package com.ssu.ssum.bookmark_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "summarizationService")
public interface SummarizationClient {

    @GetMapping("/summarization")
    public String getSummarization();
}
