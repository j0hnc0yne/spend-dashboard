package edu.iit.project.spenddashboardapi.services.vo;

import java.util.List;

public record PostedActivities (
    List<Bank2Transaction> transactions
){
}
