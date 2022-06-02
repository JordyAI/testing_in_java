package com.jordy.javatest.discounts;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorShould {

    private PriceCalculator calculator;

    @Before
    public void setup(){
        calculator = new PriceCalculator();
    }

    @Test
    public void total_zero_when_there_are_not_prices() {
        assertThat( calculator.getTotal(), is(0.0));
    }

    @Test
    public void total_is_the_sum_of_prices() {
        calculator.addPrice(10.2);
        calculator.addPrice(15.5);

        assertThat( calculator.getTotal(), is(25.7));
    }

    @Test
    public void apply_discount_to_prices() {
        calculator.addPrice(100.0);
        calculator.addPrice(55.0);
        calculator.addPrice(45.0);

        calculator.setDiscount(25);

        assertThat( calculator.getTotal(), is(150.0));
    }
}