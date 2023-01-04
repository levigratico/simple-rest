package com.gratico.project.springrestdemo.model;

import lombok.Data;

import java.util.List;

@Data
public class BankAccountsRequest {
    private List<BankAccountRequest> accounts;
}
