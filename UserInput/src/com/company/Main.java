package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner is a built-in class, lets us read user input
        // new keyword makes a new instance of Scanner object
        Scanner scanner = new Scanner(System.in);   // System.in lets you type in input to the console that then gets returned to program

        System.out.println("Enter year of birth: ");

        // check if next input is parse-able as a number or not
        boolean yearIsInt = scanner.hasNextInt();

        if (yearIsInt) {
            int YOB = scanner.nextInt();
            scanner.nextLine();     // handle nextline character (enter key); need this line after a .nextInt() call
            int age = 2019 - YOB;

            if (age <= 120 && age >= 0) {
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                System.out.println("Your name is " + name + " and you are probably " + age + " years old");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        // close scanner when totally done using it so that its memory can be freed up
        // further calls to scanner will result in error after it is closed
        scanner.close();

        // challenge: sum 5 user inputted numbers
        Scanner scanner2 = new Scanner(System.in);

        int counter = 0;
        int order = 1;
        int sum = 0;

        while (counter < 5) {
            System.out.println("Enter number #" + order + ":");
            boolean isInt = scanner2.hasNextInt();
            if (isInt) {
                int num = scanner2.nextInt();
                sum += num;
                counter++;
                order++;
            } else {
                System.out.println("Invalid number, try again");
            }
            scanner2.nextLine();
        }

        System.out.println("Sum: " + sum);
        scanner2.close();
    }
}
