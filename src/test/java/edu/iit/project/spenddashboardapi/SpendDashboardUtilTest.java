package edu.iit.project.spenddashboardapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class SpendDashboardUtilTest {
    
    // Helper method
    private List<TransactionOutput> createTransactions(List<String> transAmounts) {
        List<TransactionOutput> returnList = new ArrayList<>();
        transAmounts.forEach(
            amt -> returnList.add(createTransaction(amt))
         );
         return returnList;
    }

    // Helper method
    private TransactionOutput createTransaction(String amt) {
        TransactionOutput output = new TransactionOutput();
        output.setTransactionAmount(amt);
        return output;
    }

    @Test
    public void calculateTotal_OneTransaction() {
        List<TransactionOutput> transactions = createTransactions(List.of("44.25"));
        Double total = SpendDashboardUtil.calculateTotal(transactions);
        assertEquals(44.25, total);
    }

    @Test
    public void calculateTotal_MultipleTransactions() {
        List<TransactionOutput> transactions = createTransactions(List.of("44.25", "10.00", "200.50"));
        Double total = SpendDashboardUtil.calculateTotal(transactions);
        assertEquals(254.75, total);
    }

    @Test
    public void calculateTotal_NoTransactions() {
        List<TransactionOutput> transactions = List.of();
        Double total = SpendDashboardUtil.calculateTotal(transactions);
        assertEquals(0.00, total);
    }
}
