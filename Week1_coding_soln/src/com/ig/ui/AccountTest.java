
package com.ig.ui;

import com.ig.model.Account;
import com.ig.service.AccountService;
import com.ig.exception.InvalidAmountException;
import com.ig.exception.LowBalanceException;
import com.ig.exception.InsufficientFundsException;
import com.ig.exception.AccountNotFoundException;
import com.ig.model.Account.AcctType;

public class AccountTest {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();

        try {
            Account account1 = new Account(101, "Sai Nitin", AcctType.SAVINGS, 1200f);
            Account account2 = new Account(102, "Nanda", AcctType.CURRENT, 6000f);
            //Account account3 = new Account(103, "Sai Pranav", AcctType.SAVINGS, 400f);
            //Account account4 = new Account(104, "Janaki Ram", AcctType.SAVINGS, 900f);
            //Account account5 = new Account(102, "Pavan", AcctType.CURRENT, 4000f);




            accountService.addAccount(account1);
            accountService.addAccount(account2);
           // accountService.addAccount(account3);


            if (accountService.isValidAccount(101)) {
                System.out.println("Account 101 exists.");
            }

//            if (accountService.isValidAccount(106)) { 
//                System.out.println("Account 106 exists.");
//            }

            System.out.println("Balance of account1: " + accountService.getBalance(account1));
            System.out.println("Balance of account2: " + accountService.getBalance(account2));

            //accountService.deposit(account1, -500f);
            //System.out.println("New balance of account1 after deposit: " + accountService.getBalance(account1));
            accountService.deposit(account1, 500f);
            System.out.println("New balance of account1 after deposit: " + accountService.getBalance(account1));


            accountService.withdraw(account2, 1000f);
            System.out.println("New balance of account2 after withdrawal: " + accountService.getBalance(account2));
            
//            accountService.withdraw(account1, 100f);
//            System.out.println("New balance of account1 after withdrawal: " + accountService.getBalance(account1));

//            accountService.withdraw(account1, 500f);
//            System.out.println("New balance of account1 after withdrawal: " + accountService.getBalance(account1));
//            accountService.withdraw(account3, 2000f);
            //System.out.println("New balance of account3 after withdrawal: " + accountService.getBalance(account3));


        } catch (AccountNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (LowBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

