package com.jordy.javatest.fizzbuzz;

public class FizzBuzz {

    public static String fizzBuzz(int n){

        if (n % 5 == 0 && n % 3 == 0) { return "FizzBuzz"; }

        return n % 3 == 0 ? "Fizz" : "Buzz";
    }

}
