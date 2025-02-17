package com.ig.service;

import com.ig.model.Account;
import com.ig.exception.AccountNotFoundException;
import com.ig.exception.InsufficientFundsException;
import com.ig.exception.InvalidAmountException;

import java.util.ArrayList;
import java.util.List;

public class AccountService {

    List<Account> accountList = new ArrayList<>();

    public boolean isValidAccount(int accNumber) throws AccountNotFoundException {
        for (Account account : accountList) {
            if (account.getAccNumber().equals(accNumber)) {
                return true;
            }
        }
        throw new AccountNotFoundException("Account not found with accNumber: " + accNumber);
    }

    public void deposit(Account account, float amt) throws InvalidAmountException {
        if (amt < 0) {
            throw new InvalidAmountException("Deposit amount cannot be negative");
        }
        account.setBalance(account.getBalance() + amt);
    }

    public void withdraw(Account account, float amt) throws InvalidAmountException, InsufficientFundsException {
        if (amt < 500) {
            throw new InvalidAmountException("Minimum withdrawal amount is Rs.500");
        }

        float newBalance = account.getBalance() - amt;

        if ((account.getType() == Account.AcctType.SAVINGS && newBalance < 1000) ||
            (account.getType() == Account.AcctType.CURRENT && newBalance < 5000)) {
            throw new InsufficientFundsException("Insufficient balance for withdrawal");
        }

        account.setBalance(newBalance);
    }

    public float getBalance(Account account) {
        return account.getBalance();
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }
}
