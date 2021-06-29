package com.andemar.javatest.util;

public class StringUtil {


    public static String repeat(String str, int times) {

        if(times < 0)
            throw new IllegalArgumentException("Negative times not allowed");

        String result = "";

        for (int i = 0; i < times; i++) {
            result += str;
        }

        return result;
    }


    public static boolean isEmpty(String str) {

        if(str == null)
            throw new NullPointerException("Is null");

        str = str.trim();

        return str.isEmpty();
    }

}
