package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 1;

        while (count < 6) {
            System.out.println("From While: Count = " + count);
            count++;
        }

        // do while: always executes at least once
        do {
            System.out.println("From Do While: Count = " + count);
            count ++;
        } while (count < 6);

        int number = 4;
        int finishNumber = 30;
        int numEvenFound = 0;

        while (number < finishNumber) {
            number++;
            if (!isEven(number)) {
                continue;
            }
            System.out.println(number + " is even");
            numEvenFound++;
            if (numEvenFound > 4) {
                System.out.println("Found more than 4 even numbers");
                break;
            }
        }

    }

    public static boolean isEven(int n) {
        return (n % 2 == 0);
    }
}
