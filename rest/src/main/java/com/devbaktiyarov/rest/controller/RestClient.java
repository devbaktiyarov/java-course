package com.devbaktiyarov.rest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/rest-client")
public class RestClient {
    

    private final RestTemplate restTemplate;

    public RestClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/")
    public String getRest() {
        return restTemplate.getForObject("https://random-data-api.com/api/v2/banks", String.class);
    }

    

}
