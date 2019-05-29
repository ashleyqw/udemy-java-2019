package com.company;

public class Main {

    public static void main(String[] args) {

        // primitive types: int, long, byte, short, float, double, char, boolean
        // String not a primitive type but very common "data type" (technically a class)

        // Strings use double quotes; chars use single quotes
        String aString = "Max Whiskers";
        System.out.println(aString);
        String appendToString = aString + " makes me happy";
        System.out.println(appendToString);
        appendToString = appendToString + "! \u00A9";
        System.out.println(appendToString);

        String numString = "83.21";
        numString = numString + "14.3";
        System.out.println(numString);  // these numbers in strings not treated as numbers; need to be cast in order to do so

        String anotherString = "13";
        int anInt = 4;
        anotherString = anotherString + anInt;  // since LHS is a String type, Java converts anInt to a String to make this work
        System.out.println(anotherString);
    }
}
