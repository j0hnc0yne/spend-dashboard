package edu.iit.project.spenddashboardapi;

import io.swagger.v3.oas.annotations.media.Schema;

public class TransactionOutput {
    @Schema(name="transactionId", example = "10001", description="Globally Unique Identifier of the Transaction")
    private String transactionId;
    private String transactionDate;
    private String transactionDescription;
    private String transactionAmount;
    private String transactionPlace;
    
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
    public String getTransactionPlace() {
        return transactionPlace;
    }
    public void setTransactionPlace(String transactionPlace) {
        this.transactionPlace = transactionPlace;
    }

    
}
