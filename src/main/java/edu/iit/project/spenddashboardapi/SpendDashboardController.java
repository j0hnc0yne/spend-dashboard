package edu.iit.project.spenddashboardapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpendDashboardController {
    
    @GetMapping("/transactions")
    public TransactionOutput[] getTransactions() {
        TransactionOutput[] transactions = new TransactionOutput[3];
        TransactionOutput transaction1 = new TransactionOutput();
        transaction1.setTransactionId("1");
        transaction1.setTransactionDate("2020-01-01");
        transaction1.setTransactionDescription("Transaction 1");
        transaction1.setTransactionAmount("100.00");
        transactions[0] = transaction1;
        
        TransactionOutput transaction2 = new TransactionOutput();
        transaction2.setTransactionId("2");
        transaction2.setTransactionDate("2020-01-02");
        transaction2.setTransactionDescription("Transaction 2");
        transaction2.setTransactionAmount("200.00");
        transactions[1] = transaction2;
        
        TransactionOutput transaction3 = new TransactionOutput();
        transaction3.setTransactionId("3");
        transaction3.setTransactionDate("2020-01-03");
        transaction3.setTransactionDescription("Transaction 3");
        transaction3.setTransactionAmount("300.00");
        transactions[2] = transaction3;
        
        return transactions;
    }
}
