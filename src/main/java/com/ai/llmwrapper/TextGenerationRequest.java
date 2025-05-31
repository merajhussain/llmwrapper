package com.ai.llmwrapper;

public class TextGenerationRequest {
    private String prompt;
    private String model; // e.g., "openai", "mistral"

    // Getters and setters
    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
