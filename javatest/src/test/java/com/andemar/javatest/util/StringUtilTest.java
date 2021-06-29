package com.andemar.javatest.util;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilTest {

    @Test
    public void repeat_string_one() {
        String result = StringUtil.repeat("hola", 3);
        Assertions.assertEquals("holaholahola", result);
    }

    @Test
    public void repeat_string_multiple_times() {
        String result = StringUtil.repeat("hola", 3);
        Assertions.assertEquals("holaholahola", result);
    }

    @Test
    public void repeat_string_zero_times() {
        String result = StringUtil.repeat("hola", 0);
        Assertions.assertEquals("", result);
    }

    @Test()
    public void repeat_string_negative_times() {

        Assertions.assertThrows(IllegalArgumentException.class, () ->
            {
                StringUtil.repeat("hola", -1);
            }
        );

    }

    //------------ TEST para el metodo isEmpty ------------------\\
    @Test()
    public void not_is_empty() {

        boolean result = StringUtil.isEmpty("No soy empty");

        Assertions.assertFalse(result);
    }

    @Test()
    public void is_empty() {

        boolean result = StringUtil.isEmpty("");

        Assertions.assertTrue(result);
    }

    @Test()
    public void is_null() {

        Assertions.assertThrows(NullPointerException.class, () -> {
           StringUtil.isEmpty(null);
        });
    }

    @Test()
    public void is_empty_with_spaces() {

        boolean result = StringUtil.isEmpty("       ");

        Assertions.assertTrue(result);
    }
}