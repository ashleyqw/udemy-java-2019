package com.company;

public class Main {

    public static void main(String[] args) {

        int intValue = 5;           // int width is 32 bits = 4 bytes
        float floatValue = 5f;      // float width is 32 bits = 4 bytes
        double doubleValue = 5d;    // double width is 64 bits = 8 bytes

        System.out.println("intValue = " + intValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);

        int intValue2 = 5 / 3;
        float floatValue2 = 5f / 3f;
        double doubleValue2 = 5d / 3d;

        System.out.println("intValue2 = " + intValue2);
        System.out.println("floatValue2 = " + floatValue2);
        System.out.println("doubleValue2 = " + doubleValue2);

        // double type takes more space, but is more precise and more "default" for Java
        // it is even usually faster for modern computers to work with

        double numPounds = 200d;
        double convertedToKg = numPounds * 0.45359237d;
        System.out.println("200 lb in kg = " + convertedToKg);

        double lotsOfDigits = 3_020_340.239_481_0d; // can still use underscores in decimal nums

    }
}
