package edu.iit.project.spenddashboardapi.services;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import edu.iit.project.spenddashboardapi.services.vo.Bank1ServiceResponse;

@Component
public class Bank1Service {
    private static final String BASE_URL = "https://qfjcxa2dvw.us-east-2.awsapprunner.com";
    
    private final RestClient restClient;

    public Bank1Service () {
        restClient = RestClient.create(BASE_URL);
    }

    public Bank1ServiceResponse getTransactions(String accountId) {
        Bank1ServiceResponse response = restClient.get()
            .uri("/api/bank1/account/transactions/{accountId}", accountId)
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .body(Bank1ServiceResponse.class);
        return response;
    }
}
