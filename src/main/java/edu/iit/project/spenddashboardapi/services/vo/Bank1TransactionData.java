package edu.iit.project.spenddashboardapi.services.vo;

import java.util.List;

public record Bank1TransactionData (
    String totalTransactions,
    String totalPaymentsAndCredits,
    String totalRunningBalance,
    List<Bank1Transaction> postedTransactions
)
{

}
