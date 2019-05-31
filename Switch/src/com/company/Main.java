package com.company;

public class Main {

    public static void main(String[] args) {

        // switches supported from JDK 7 onwards
        // can use char, byte, short, int, String as switch value

        int switchValue = 3;

        // break is very important, ow it'll keep executing next case's statements
        switch (switchValue) {
            case 1:
                System.out.println("It's a 1");
                break;
            case 2:
                System.out.println("It's a 2");
                break;
            case 3: case 4: case 5:
                System.out.println("3 or 4 or 5");
                System.out.println("Specifically it was " + switchValue);
                break;
            default:
                System.out.println("Not 1 through 5");
                break;
        }

        // Strings have to match case so may need String.toLowerCase() method
        String month = "JaNuArY";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "may":
                System.out.println("May");
                break;
            default:
                System.out.println("IDK");
                break;
        }

    }
}
