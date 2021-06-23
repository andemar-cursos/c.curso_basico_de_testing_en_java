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
}