package com.company;

public class Main {

    public static void main(String[] args) {

        // int has width of 32
        int minIntValue = -2147483648;
        int maxIntValue = 2_147_483_647;    // underscores make the number more readable
        int newIntValue = (maxIntValue / 2);

        // byte has width of 8
        byte minByteValue = -128;
        byte maxByteValue = 127;
        byte newByteValue = (byte) (maxByteValue / 2);   // cast right hand side result to byte type since Java makes it int by default

        // short has width of 16
        short minShortValue = -32768;
        short maxShortValue = 32767;

        // long has width of 64
        long minLongValue = -9223372036854775808L;
        long maxLongValue = 9_223_372_036_854_775_807L;
        long newLongValue = (maxLongValue / 2);     // don't need to cast RHS for long type; it will accept int types

    }
}
