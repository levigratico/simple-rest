package com.gratico.project.springrestdemo.model;

import com.gratico.project.springrestdemo.dao.entity.BankAccount;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class BankAccountResponse {
    private BankAccount account;
}
