package com.virtualsociety.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final ChatClient chatClient;

    public TestController(ChatClient.Builder builder){
        this.chatClient = builder.build();
    }

    @PostMapping("/ask")
    public String ask(@RequestParam String prompt){
        return chatClient.prompt().user(prompt).call().content();
    }
}
