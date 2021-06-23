package com.andemar.javatest.util;

public class FizzBuzz {


    public static String start(int i) {

        if((i % 3 == 0) && (i % 5 == 0))
            return "FizzBuzz";

        if(i % 3 == 0)
            return "Fizz";

        if(i % 5 == 0)
            return "Buzz";

        return i+"";
    }
}
