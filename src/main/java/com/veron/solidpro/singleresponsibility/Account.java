package com.veron.solidpro.singleresponsibility;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNyumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
}