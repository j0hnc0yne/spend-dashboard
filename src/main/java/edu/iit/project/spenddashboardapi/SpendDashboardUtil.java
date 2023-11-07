package edu.iit.project.spenddashboardapi;

import java.util.List;

public class SpendDashboardUtil {
    
    public static Double calculateTotal(List<TransactionOutput> transactionList) {
        Double total = 0.0;
        for (TransactionOutput transaction : transactionList) {
            total += Double.parseDouble(transaction.getTransactionAmount());
        }
        return total;
    }
}
