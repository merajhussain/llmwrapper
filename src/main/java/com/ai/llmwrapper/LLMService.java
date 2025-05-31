package com.ai.llmwrapper;

public interface LLMService {
    /**
     * Generates text based on the given prompt.
     *
     * @param prompt The input prompt for text generation.
     * @return The generated text.
     */
    String generateText(String prompt);

    /**
     * Analyzes the sentiment of the given text.
     *
     * @param text The input text for sentiment analysis.
     * @return The sentiment analysis result.
     */
    String analyzeSentiment(String text);

    // Add other common methods as needed
}
