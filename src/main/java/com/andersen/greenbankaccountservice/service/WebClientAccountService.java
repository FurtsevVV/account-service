package com.andersen.greenbankaccountservice.service;

import com.andersen.greenbankaccountservice.entity.CardIdAccountDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
public class WebClientAccountService {

    private final WebClient webClient;

    public CardIdAccountDto getUserCardDtoByCardIdAsync(final String id) {
        return webClient
                .get()
                .uri(String.join("", "/card/", id))
                .retrieve()
                .bodyToMono(CardIdAccountDto.class).block();
    }
}
