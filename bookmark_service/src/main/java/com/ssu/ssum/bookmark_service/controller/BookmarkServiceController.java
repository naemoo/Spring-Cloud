package com.ssu.ssum.bookmark_service.controller;

import com.ssu.ssum.bookmark_service.client.SummarizationClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookmark")
public class BookmarkServiceController {
    @Autowired
    SummarizationClient summarizationClient;

    @GetMapping()
    public String getBookmarks() {
        return "This is BookmarkService using " + summarizationClient.getSummarization();
    }
}
