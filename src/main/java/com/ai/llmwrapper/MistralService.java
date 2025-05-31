package com.ai.llmwrapper;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.ai.mistralai.MistralAiChatModel;


@Service
public class MistralService implements LLMService {

    private final MistralAiChatModel chatModel;

    @Autowired
    public MistralService(MistralAiChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @Override
    public String generateText(String prompt) {
        // Use the auto-configured Mistral chat model to generate text
        return chatModel.call((prompt));
    }

    @Override
    public String analyzeSentiment(String text) {
        // Wrap the input in a sentiment-analysis prompt
     return "";
    }
}
