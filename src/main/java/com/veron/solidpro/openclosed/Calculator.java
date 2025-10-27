package com.veron.solidpro.openclosed;

public class Calculator {

    public int calclateNumber(int a, int b, Operation operation){
        return operation.perform(a, b);
    }
    
}