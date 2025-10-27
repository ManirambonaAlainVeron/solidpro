package com.veron.solidpro.singleresponsibility;

public class AccountOperation {

    public void updateAccountNumber(Account account, String newAccountNumber){
        account.setAccountNumber(newAccountNumber);
    }
    
}
