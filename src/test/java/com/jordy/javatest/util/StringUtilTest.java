package com.jordy.javatest.util;

public class StringUtilTest {

    public static void main(String[] args) {
        String result = StringUtil.repeat("hola",3);

        if (!result.equals("holaholahola")){
            System.out.println("Error ");
        }
    }

}