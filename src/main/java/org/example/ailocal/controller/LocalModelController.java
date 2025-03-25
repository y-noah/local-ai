package org.example.ailocal.controller;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalModelController {


    @Autowired
    private OllamaChatModel ollamaChatModel;

    @GetMapping("/ai/local")
    public String local() {
        String prompt = "你以愤怒的口吻说话";
        String message =
                """
                 给我讲一个笑话
                """;
        String result = ollamaChatModel.call(prompt + ":" + message);

        return result;
    }

}