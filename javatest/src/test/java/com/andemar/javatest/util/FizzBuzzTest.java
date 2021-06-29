package com.andemar.javatest.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void is_divisible_by_3_Fizz() {

        Assertions.assertEquals("Fizz", FizzBuzz.start(3));
        Assertions.assertEquals("Fizz", FizzBuzz.start(6));
    }

    @Test
    void is_divisible_by_5_Buzz() {

        Assertions.assertEquals("Buzz", FizzBuzz.start(5));
        Assertions.assertEquals("Buzz", FizzBuzz.start(10));
    }

    @Test
    void is_divisible_by_3_and_5_FizzBuzz() {

        Assertions.assertEquals("FizzBuzz", FizzBuzz.start(15));
        Assertions.assertEquals("FizzBuzz", FizzBuzz.start(30));
    }

    @Test
    void not_is_divisible_by_3_and_5_return_number() {

        Assertions.assertEquals("2", FizzBuzz.start(2));
        Assertions.assertEquals("16", FizzBuzz.start(16));
    }
}