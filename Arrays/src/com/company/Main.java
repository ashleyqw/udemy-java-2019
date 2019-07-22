package com.company;

import java.util.Arrays;
import java.util.Scanner;

// Arrays are a "reference type"; be careful with aliasing
// There are also "value types", like what primitives are

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] myIntegers = getArray(5);
	    int[] sortedIntegers = sortArray(myIntegers);
	    printArray(sortedIntegers);
    }

    public static int[] getArray(int arraySize) {
        int[] array = new int[arraySize];
        System.out.println("Enter " + arraySize + " values:\r");
        for (int i=0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
//        for (int i=0; i < array.length; i++) {
//            System.out.println("Array element #" + i + " is " + array[i]);
//        }
        System.out.println(Arrays.toString(array));
    }

    // sort input array in decreasing order in an extremely inefficient way
    public static int[] sortArray(int[] array) {
        int[] sorted = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i=0; i < array.length-1; i++) {
                if (array[i] < array[i+1]) {
                    temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sorted;
    }
}
