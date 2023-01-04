package com.gratico.project.springrestdemo.controller;

import com.gratico.project.springrestdemo.model.BankAccountRequest;
import com.gratico.project.springrestdemo.model.BankAccountResponse;
import com.gratico.project.springrestdemo.model.BankAccountsRequest;
import com.gratico.project.springrestdemo.model.BankAccountsResponse;
import com.gratico.project.springrestdemo.service.BankAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/banks")
public class BankAccountController {

    private final BankAccountService bankAccountService;

    @GetMapping("/accounts")
    public BankAccountsResponse getBankAccounts() {
        return bankAccountService.getBankAccounts();
    }

    @GetMapping("/account/{id}")
    public BankAccountResponse getBankAccount(@PathVariable UUID id) {
        return bankAccountService.getBankAccount(id);
    }

    @PostMapping("/accounts")
    public BankAccountsResponse addAccounts(@RequestBody BankAccountsRequest request) {
        return bankAccountService.addAccounts(request);
    }

    @PostMapping("/account")
    public BankAccountResponse addAccount(@RequestBody BankAccountRequest request) {
        return bankAccountService.addAccount(request);
    }

}
