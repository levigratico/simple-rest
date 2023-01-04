package com.gratico.project.springrestdemo.model;

import com.gratico.project.springrestdemo.dao.entity.BankAccount;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class BankAccountsResponse {
    private List<BankAccount> accounts;
}
