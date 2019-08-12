package com.xyz.app.StringManipulation;

public class ReverseStringRecursion {
    public static String doReverse(String input) {
        if(input.length() == 0) {
            return "";
        } else {
            return doReverse(input.substring(1)) + input.charAt(0);
        }
    }

    public static String doReverseBetter(String input) {
        if(input.isEmpty())
            return input;
        //else put the character at the beginning to the end
        //make a recursive call
        return doReverseBetter(input.substring(1))+input.charAt(0);
    }
}
