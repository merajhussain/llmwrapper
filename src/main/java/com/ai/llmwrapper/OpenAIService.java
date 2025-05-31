package com.ai.llmwrapper;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatCompletionResult;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.service.OpenAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.List;

@Service
public class OpenAIService implements LLMService {

    @Value("${openai.api.key}")
    private String apiKey;

    @Override
    public String generateText(String prompt) {

        OpenAiService service = new OpenAiService(apiKey, Duration.ofSeconds(30));
        ChatMessage userMessage = new ChatMessage("user", prompt);
        ChatCompletionRequest chatRequest = ChatCompletionRequest.builder()
                .model("gpt-3.5-turbo")    // ← supported chat model
                .messages(List.of(userMessage))
                .build();

        // 3. Send the chat request
        ChatCompletionResult chatResult = service.createChatCompletion(chatRequest);

        // 4. Extract the assistant’s reply
        String generated = chatResult.getChoices()
                .get(0)
                .getMessage()
                .getContent()
                .trim();

        return generated;
    }

    @Override
    public String analyzeSentiment(String text) {
        // Implementation for sentiment analysis using OpenAI API
        // Use the apiKey to authenticate and make requests to the OpenAI API
        return "Sentiment analysis result from OpenAI";
    }
}
