package com.ai.llmwrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/llm")
public class LLMController {

    @Autowired
    private LLMServiceFacade llmServiceFacade;

    @PostMapping("/generate")
    public ResponseEntity<String> generateText(@RequestBody TextGenerationRequest request) {
        String generatedText = llmServiceFacade.generateText(request.getPrompt(), request.getModel());
        return ResponseEntity.ok(generatedText);
    }
}
