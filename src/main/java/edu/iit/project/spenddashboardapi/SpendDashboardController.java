package edu.iit.project.spenddashboardapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RestController
public class SpendDashboardController {

    @Operation(summary = "Get Transactions by Account ID")
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Found user and transactions", 
            content = { @Content(mediaType = "application/json", 
            schema = @Schema(implementation = TransactionOutput.class)) }),
        @ApiResponse(responseCode = "400", description = "Invalid account ID found", content = @Content), 
        @ApiResponse(responseCode = "404", description = "Account not found", content = @Content) 
    })
    @GetMapping("/transactions/{accountId}")
    public List<TransactionOutput> getTransactions(@PathVariable String accountId) throws UserNotFoundException {
        // Hardcoding responses for initial demo purposes
        List<TransactionOutput> transactions = switch(accountId) {
            case "10001" -> trans10001();
            case "10002" -> trans10002();
            default -> { throw new UserNotFoundException(); }
        };
        
        return transactions;
    }

    private List<TransactionOutput> trans10001() {
        List<TransactionOutput> transactions = new ArrayList<>();
        TransactionOutput transaction1 = new TransactionOutput();
        transaction1.setTransactionId("1");
        transaction1.setTransactionDate("2023-02-01");
        transaction1.setTransactionDescription("Transaction 1");
        transaction1.setTransactionAmount("100.00");
        transactions.add(transaction1);
        
        TransactionOutput transaction2 = new TransactionOutput();
        transaction2.setTransactionId("2");
        transaction2.setTransactionDate("2023-01-02");
        transaction2.setTransactionDescription("Transaction 2");
        transaction2.setTransactionAmount("200.00");
         transactions.add(transaction2);
        
        TransactionOutput transaction3 = new TransactionOutput();
        transaction3.setTransactionId("3");
        transaction3.setTransactionDate("2023-01-03");
        transaction3.setTransactionDescription("Transaction 3");
        transaction3.setTransactionAmount("300.00");
        transactions.add(transaction3);
        return transactions;
    }

    private List<TransactionOutput> trans10002() {
        List<TransactionOutput> transactions = new ArrayList<>();
        TransactionOutput transaction1 = new TransactionOutput();
        transaction1.setTransactionId("1");
        transaction1.setTransactionDate("2023-04-04");
        transaction1.setTransactionDescription("Some Transaction");
        transaction1.setTransactionAmount("5.00");
        transactions.add(transaction1);
        
        TransactionOutput transaction2 = new TransactionOutput();
        transaction2.setTransactionId("2");
        transaction2.setTransactionDate("2023-05-06");
        transaction2.setTransactionDescription("Another Transaction");
        transaction2.setTransactionAmount("1000.00");
        transactions.add(transaction2);
        return transactions;
    }
    
    
    private List<TransactionOutput> trans10003() {
        List<TransactionOutput> transactions = new ArrayList<>();
        TransactionOutput transaction1 = new TransactionOutput();
        transaction1.setTransactionId("1");
        transaction1.setTransactionDate("2023-11-04");
        transaction1.setTransactionDescription("one more transaction");
        transaction1.setTransactionAmount("5.00");
        transactions.add(transaction1);
        
        TransactionOutput transaction2 = new TransactionOutput();
        transaction2.setTransactionId("2");
        transaction2.setTransactionDate("2023-01-08");
        transaction2.setTransactionDescription("Transaction once more");
        transaction2.setTransactionAmount("9000.00");
        transactions.add(transaction2);
        return transactions;
    }
}
