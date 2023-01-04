package com.gratico.project.springrestdemo.service;

import com.gratico.project.springrestdemo.dao.entity.BankAccount;
import com.gratico.project.springrestdemo.dao.repository.BankAccountRepository;
import com.gratico.project.springrestdemo.model.BankAccountRequest;
import com.gratico.project.springrestdemo.model.BankAccountResponse;
import com.gratico.project.springrestdemo.model.BankAccountsRequest;
import com.gratico.project.springrestdemo.model.BankAccountsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BankAccountService {
    private final BankAccountRepository bankAccountRepository;

    public BankAccountsResponse getBankAccounts() {
        return BankAccountsResponse.builder().accounts(bankAccountRepository.findAll()).build();
    }

    public BankAccountResponse getBankAccount(UUID id) {
        return BankAccountResponse.builder().account(bankAccountRepository.findById(id).orElse(null)).build();
    }

    public BankAccountsResponse addAccounts(BankAccountsRequest request) {
        return BankAccountsResponse.builder()
                .accounts(bankAccountRepository.saveAll(request
                        .getAccounts().stream()
                        .map(account -> BankAccount.builder()
                                .name(account.getName())
                                .totalAmount(account.getTotalAmount())
                                .build())
                        .collect(Collectors.toList())))
                .build();
    }

    public BankAccountResponse addAccount(BankAccountRequest request) {
        return BankAccountResponse.builder()
                .account(bankAccountRepository.save(BankAccount.builder()
                                .totalAmount(request.getTotalAmount())
                                .name(request.getName())
                        .build()))
                .build();
    }
}
