package com.andemar.javatest.discounts;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

class PriceCalculatorShould {

    @Test
    void total_zero_when_there_are_not_prices() {
        PriceCalculator calculator = new PriceCalculator();

        assertThat(calculator.getTotal(), is(0.0));
    }

    @Test
    void total_is_the_sum_of_prices() {

        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(10.0);
        calculator.addPrice(25.5);

        assertThat(calculator.getTotal(), is(35.5));
    }

    @Test
    void apply_discount_to_prices() {

        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(54.3);
        calculator.addPrice(64.54);

        calculator.setDiscount(25);

        assertThat(calculator.getTotal(), is(89.13));
    }
}