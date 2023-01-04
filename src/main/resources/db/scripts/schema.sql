CREATE SCHEMA IF NOT EXISTS budgetmanagementsystem;

CREATE TABLE bank_account_tbl (
    id              UUID            NOT NULL,
    name            VARCHAR(50)     NOT NULL,
    total_amount    DECIMAL(10, 2),
    created_date    DATETIME        NOT NULL,
    updated_date    DATETIME        NOT NULL,
    PRIMARY KEY(ID)
);