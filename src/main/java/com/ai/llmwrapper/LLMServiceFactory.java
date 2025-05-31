package com.ai.llmwrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LLMServiceFactory {

    @Autowired
    private OpenAIService openAIService;

    @Autowired
    private MistralService mistralService;

    public LLMService getService(String model) {
        switch (model) {
            case "openai":
                return openAIService;
            case "mistral":
                return mistralService;
            default:
                throw new IllegalArgumentException("Unknown model: " + model);
        }
    }
}