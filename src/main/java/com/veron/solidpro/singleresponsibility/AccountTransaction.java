package com.veron.solidpro.singleresponsibility;


public class AccountTransaction {

    public AccountTransaction(){}
  
    public void deposit(Account account, double amount){
        if(amount>0){
            double newBlance = account.getBalance() + amount;
            System.out.println("Desposit of"+amount+"successful. New balance:"+newBlance);
        }
    }

    public void withdraw(Account account, double amount){
        if(amount>0 && amount <= account.getBalance()){
            double newBalance = account.getBalance()-amount;
            System.out.println("Wihtdrawal of"+amount+"successful. New balance:"+newBalance);
        }

    }
}
