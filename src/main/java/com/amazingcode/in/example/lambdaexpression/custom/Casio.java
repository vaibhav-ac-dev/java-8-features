package com.amazingcode.in.example.lambdaexpression.custom;

public class Casio {
    public static final Calculator calculateSum = (digits) -> {
        Long result = 0L;
        for(Long digit : digits){
            result += digit;
        }
        return result;
    };

    public static final Calculator calculateMultiply = (digits) -> {
        Long result = 1L;
        for(Long digit : digits){
            result *= digit;
        }
        return result;
    };
}
