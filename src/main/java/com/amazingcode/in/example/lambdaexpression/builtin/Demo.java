package com.amazingcode.in.example.lambdaexpression.builtin;

import java.awt.event.ActionListener;
import java.util.Random;
import java.util.function.*;

public class Demo {
    public static void main(String [] args){

        // List of some Functional interface
    /*  1. Predicate
        2. BiPredicate
        3. Consumer
        4. Runnable
        5. Supplier
        6. Function
        7. BiFunction
    */

        // Using test method of Predicate interface
        Predicate<Student> predicate = student -> {
            return student.getAge() > 18L;
        };
        Student student = new Student(1L,"Vaibhav",24L);
        System.out.println("Student not minor: "+ predicate.test(student));

        // Using and, or, and negate method from Predicate interface
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isPositive = num -> num > 0;

        // Check if a number is both positive and even
        Predicate<Integer> isPositiveAndEven = isPositive.and(isEven);
        System.out.println("Is 4 positive and even? " + isPositiveAndEven.test(4)); // Output: true
        System.out.println("Is -4 positive and even? " + isPositiveAndEven.test(-4)); // Output: false

        // Check if a number is either positive or even
        Predicate<Integer> isPositiveOrEven = isPositive.or(isEven);
        System.out.println("Is -3 positive or even? " + isPositiveOrEven.test(-3)); // Output: false
        System.out.println("Is -4 positive or even? " + isPositiveOrEven.test(-4)); // Output: true

        // Negate the predicate to check if a number is odd
        Predicate<Integer> isOdd = isEven.negate();
        System.out.println("Is 3 odd? " + isOdd.test(3)); // Output: true

        //==================================================================================================================

        // Using test method of BiPredicate interface
        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;

        // BiPredicate to check if both numbers are positive
        BiPredicate<Integer, Integer> areBothPositive = (a, b) -> a > 0 && b > 0;

        // Combine predicates: both numbers are positive and the first is greater
        BiPredicate<Integer, Integer> combinedPredicate = isGreater.and(areBothPositive);

        // Test the combined BiPredicate
        System.out.println(combinedPredicate.test(10, 5)); // Output: true
        System.out.println(combinedPredicate.test(-10, 5)); // Output: false

        // Combine predicates with or: either first is greater or both are positive
        BiPredicate<Integer, Integer> orPredicate = isGreater.or(areBothPositive);

        System.out.println(orPredicate.test(10, -5)); // Output: true
        System.out.println(orPredicate.test(-10, -5)); // Output: false

        //==================================================================================================================

        // Using accept method of Consumer interface
        Consumer<Student> consumer = student1 -> {
            System.out.println(student1);
        };
        consumer.accept(student);

        //==================================================================================================================

        // Using run method of Runnable interface
        Runnable runnable = () -> {
            System.out.println("I am running...");
        };
        runnable.run();

        //==================================================================================================================

        // Using apply method of Function interface
        Function<Integer, Integer> function = digit -> {
            return digit * digit;
        };
        System.out.println(function.apply(5));

        // Using compose and andThen method of Function interface
        Function<Integer, Integer> addTwo = x -> x + 2;
        Function<Integer, Integer> square = x -> x * x;

        // Using andThen: First add 2, then square
        Function<Integer, Integer> addThenSquare = addTwo.andThen(square);
        System.out.println("Result of (5 + 2) squared: " + addThenSquare.apply(5)); // Output: 49

        // Using compose: First square, then add 2
        Function<Integer, Integer> squareThenAdd = addTwo.compose(square);
        System.out.println("Result of 5 squared, then +2: " + squareThenAdd.apply(5)); // Output: 27

        //==================================================================================================================

        // Using get method of Supplier interface
        Random random = new Random();
        Supplier<Integer> randomNumber = () -> random.nextInt(100);
        System.out.println(randomNumber.get());

        //==================================================================================================================

        // Using apply method of BiFunction interface
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println("Product: " + multiply.apply(5, 3)); // Output: Product: 15

        Function<Integer, String> addPrefix = result -> "Result: " + result;
        BiFunction<Integer, Integer, String> multiplyAndConvert = multiply.andThen(addPrefix);
        // Use the composed function
        System.out.println(multiplyAndConvert.apply(4, 5)); // Output: Result: 20

        //==================================================================================================================

    }
}
