package com.example.lambdaexpressions;

public class LambdaExpression {

    public static void main(String[] args) {

        // 1) Implementing in class: please see CalculateAddition class
        CalculateAddition calculateAddition = new CalculateAddition();
        System.out.println("Using implement in class: " + calculateAddition.add(8, 1));



        // 2) Using annonymous class
        Addition addition = new Addition(){
            @Override
            public int add(int a, int b){
                return (a+b);
            }
        };
        System.out.println("Using annonymous class: " + addition.add(6, 7));


        
        // 3) Using lambda expression
        Addition addition1 = (a,b) -> (a+b);
        System.out.println("Using lambda expression: " + addition1.add(5, 4));

    }
}
