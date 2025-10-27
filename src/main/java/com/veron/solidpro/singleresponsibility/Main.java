package com.veron.solidpro.singleresponsibility;


public class Main {
    
    public static void main(String[] args){
        Account account = new Account("123456",50000);
        AccountTransaction transaction = new AccountTransaction();
        transaction.deposit(account, 100000);
        transaction.withdraw(account,200000);
    }
    
}
