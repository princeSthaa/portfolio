package com.prince.portfolio;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class selfping {
    private final RestTemplate rstTmp = new RestTemplate();
    @Scheduled(fixedRate = 10000)
    public void ping() {
        System.out.println("refreshed");
        rstTmp.getForObject("http://localhost:8080",String.class);

    }
}
