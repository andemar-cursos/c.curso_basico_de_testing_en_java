package com.andemar.javatest.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {


    @Test
    void one_numer() {

        Assertions.assertEquals("I", RomanNumerals.arabicToRoman(1));
    }


    @Test
    void name() {

    }
}