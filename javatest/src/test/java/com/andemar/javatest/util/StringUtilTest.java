package com.andemar.javatest.util;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilTest {

    @Test
    public void testRepeat() {
        String result = StringUtil.repeat("hola", 3);
        Assertions.assertEquals("holaholahola", result);
    }

}