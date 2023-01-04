package com.gratico.project.springrestdemo.model;

import lombok.Data;

@Data
public class BankAccountRequest {
    private String name;
    private Double totalAmount;
}
