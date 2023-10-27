package edu.iit.project.spenddashboardapi.services;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import edu.iit.project.spenddashboardapi.services.vo.Bank2ServiceResponse;

@Component
public class Bank2Service {
    private static final String BASE_URL = "https://qfjcxa2dvw.us-east-2.awsapprunner.com";
    
    private final RestClient restClient;

    public Bank2Service () {
        restClient = RestClient.create(BASE_URL);
    }

    public Bank2ServiceResponse getTransactions(String accountId) {
        Bank2ServiceResponse response = restClient.get()
            .uri("/api/bank2/account/transactions/{accountId}", accountId)
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .body(Bank2ServiceResponse.class);
        return response;
    }
}
