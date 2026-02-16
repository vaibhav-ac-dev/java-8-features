package com.example.lambdaexpressions;

public class CalculateAddition implements Addition {

    @Override
    public int add(int a, int b) {
        return (a+b);
    }
    
}
