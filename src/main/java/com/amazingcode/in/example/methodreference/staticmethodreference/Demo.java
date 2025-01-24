package com.amazingcode.in.example.methodreference.staticmethodreference;

import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;

public class Demo {
    public static void main(String [] args){

        // Lambda expression
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("Lambda expression: Printing string: Vaibhav");

        // Method reference
        Consumer<String> printer1 = System.out::println;
        printer1.accept("Method reference: Printing string: Shejol");

        //==========================================================================================================

        // Lambda expression
        DoubleUnaryOperator squareRoot = digit -> Math.sqrt(digit);
        System.out.println("Lambda expression: Square root of 25: "+squareRoot.applyAsDouble(25));

        // Static method reference
        DoubleUnaryOperator sqrt = Math::sqrt;
        System.out.println("Static method reference: Square root of 81: "+sqrt.applyAsDouble(81));

        //==========================================================================================================


    }
}
