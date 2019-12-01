package com.launchcode.java;

public class Calculator implements AdvanceArithmetic {
    int total = 0;
    @Override
    public int divisorSum(int n){
        for (int o = n; o > 0; o -= 1){
            if (n % o == 0) {
                total += o;
            }
        }
        return total;
    }
}
