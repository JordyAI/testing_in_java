package com.jordy.javatest.fizzbuzz;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class FizzBuzzShould {

    @Test
    public void return_Fizz_if_number_divisible_by_3() {
        assertThat(FizzBuzz.fizzBuzz(9), is("Fizz"));
    }

    @Test
    public void return_Buzz_if_number_divisible_by_5() {
        assertThat(FizzBuzz.fizzBuzz(25), is("Buzz"));
    }

    @Test
    public void return_FizzBuzz_if_number_divisible_by_5_and_by_3() {
        assertThat(FizzBuzz.fizzBuzz(15), is("FizzBuzz"));
    }

    @Test
    public void return_the_same_number_if_other_case() {
        assertThat(FizzBuzz.fizzBuzz(2), is("2"));
    }
}