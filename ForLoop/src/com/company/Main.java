package com.company;

public class Main {

    public static void main(String[] args) {

	    for (int i=2; i<9; i++) {
            System.out.println("interest on $10000 with rate " + i + "% is " +
                    calcInterest(10000, i));
        }

        for (int i=8; i>=2; i-=2) {
            System.out.println("interest on $500 with rate " + i + "% is " +
                    calcInterest(500, i));
        }

    }

    public static double calcInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
