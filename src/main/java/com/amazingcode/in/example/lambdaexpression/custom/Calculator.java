package com.amazingcode.in.example.lambdaexpression.custom;

@FunctionalInterface
public interface Calculator {
    Long calculate(Long ...digits);
}
