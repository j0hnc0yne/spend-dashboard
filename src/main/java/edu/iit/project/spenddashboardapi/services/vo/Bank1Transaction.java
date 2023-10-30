package edu.iit.project.spenddashboardapi.services.vo;

public record Bank1Transaction(
    String date,        //  MM/DD/YYYY
    String description, //  
    String category,    // eg "Services"
    String amount       // eg "172.17"
) {}
