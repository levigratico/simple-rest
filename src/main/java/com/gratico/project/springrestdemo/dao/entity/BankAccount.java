package com.gratico.project.springrestdemo.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "bank_account_tbl")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BankAccount extends AbstractEntity {
    @NotNull
    private String name;

    @Column(name = "total_amount")
    private Double totalAmount;
}
