package com.dev.springsound.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {

    public static String obterInformacao(String texto) {
        OpenAiService service = new OpenAiService("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");

        CompletionRequest requisicao = CompletionRequest.builder()
                .model("text-davinci-003")
                .prompt("detalhes sobre o artista " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}
