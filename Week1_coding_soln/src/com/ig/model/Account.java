package com.ig.model;

import com.ig.exception.InvalidAmountException;
import com.ig.exception.LowBalanceException;

public class Account {
    private Integer accNumber;
    private String custName;
    private AcctType type; 
    private Float balance;

    public enum AcctType {
        SAVINGS, CURRENT
    }

    public Account(Integer accNumber, String custName, AcctType type, Float balance) throws InvalidAmountException, LowBalanceException {
        if (balance < 0) {
            throw new InvalidAmountException("Balance cannot be negative");
        }
        this.accNumber = accNumber;
        this.custName = custName;
        this.type = type;

        if (type == AcctType.SAVINGS && balance < 1000) {
            throw new LowBalanceException("Low balance for Savings Account");
        } else if (type == AcctType.CURRENT && balance < 5000) {
            throw new LowBalanceException("Low balance for Current Account");
        }

        this.balance = balance;
    }

    public Integer getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(Integer accNumber) {
        this.accNumber = accNumber;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public AcctType getType() {
        return type;
    }

    public void setType(AcctType type) {
        this.type = type;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}
