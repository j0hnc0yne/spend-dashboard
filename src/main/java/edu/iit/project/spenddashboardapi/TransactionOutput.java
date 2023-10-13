package edu.iit.project.spenddashboardapi;

public class TransactionOutput {
    private String transactionId;
    private String transactionDate;
    private String transactionDescription;
    private String transactionAmount;
    
    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public String getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
    public String getTransactionDescription() {
        return transactionDescription;
    }
    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }
    public String getTransactionAmount() {
        return transactionAmount;
    }
    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    
}
