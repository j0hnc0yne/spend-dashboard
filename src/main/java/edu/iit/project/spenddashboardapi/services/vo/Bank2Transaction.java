package edu.iit.project.spenddashboardapi.services.vo;

public record Bank2Transaction(
    String type,
    String transactionDate,        //ISO Format - 2023-10-13T00:00:00.000-04:00"
    String activityDirection,       //INBOUND or OUTBOUND
    String description,
    Bank2Amount amount,
    Bank2Account fromAccount,
    Bank2Account toAccount
) {
}
