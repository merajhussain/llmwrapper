package com.ai.llmwrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LLMServiceFacade {

    @Autowired
    private LLMServiceFactory llmServiceFactory;

    public String generateText(String prompt, String model) {
        LLMService service = llmServiceFactory.getService(model);
        return service.generateText(prompt);
    }

    public String analyzeSentiment(String text, String model) {
        LLMService service = llmServiceFactory.getService(model);
        return service.analyzeSentiment(text);
    }
}