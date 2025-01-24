package com.amazingcode.in.example.lambdaexpression.custom;

public class CalculateDemo {
    public static void main(String [] args){

        Long totalSum = Casio.calculateSum.calculate(10L,20L,30L,40L,50L);
        System.out.println("Sum is equal = "+ totalSum);

        Long totalMultiply = Casio.calculateMultiply.calculate(10L,20L,30L,40L,50L);
        System.out.println("Multiplication is equal = "+ totalMultiply);

        Calculator calculate = (digits) -> {
            Long result = 0L;
            for(Long digit : digits){
                result += digit;
            }
            result *=2;
            result -=10;
            return result;
        };

        Long result = calculate.calculate(10L,20L,30L,40L,50L);
        System.out.println("Final result is equal = "+ result);
    }
}
