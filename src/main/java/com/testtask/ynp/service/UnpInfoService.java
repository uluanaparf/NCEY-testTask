package com.testtask.ynp.service;

import com.testtask.ynp.dto.UnpInfoDto;
import com.testtask.ynp.model.UnpInfoResponse;
import com.testtask.ynp.model.UnpInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UnpInfoService {

    private final RestTemplate restTemplate;

    @Value("${external.api.url}")
    private String apiUrl;

    public UnpInfoService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public UnpInfoDto getInfoByUnp(String unp) {
        String url = apiUrl + "?unp=" + unp + "&type=json";

        ResponseEntity<UnpInfoResponse> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {}
        );

        UnpInfo data = response.getBody().getRow();
        if (data == null ) {
            throw new RuntimeException("Плательщик с УНП " + unp + " не найден.");
        }


        return new UnpInfoDto(
                data.getUnp(),
                data.getFullName(),
                data.getAddress(),
                data.getRegistrationDate(),
                convertStatusCode(data.getStatusCode())
        );
    }

    private String convertStatusCode(String code) {
        return switch (code) {
            case "1" -> "Действующий";
            case "2" -> "Ликвидирован";
            case "3" -> "В стадии ликвидации";
            default -> "Неизвестно";
        };
    }
}
