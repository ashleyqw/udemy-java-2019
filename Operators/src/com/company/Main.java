package com.company;

public class Main {

    public static void main(String[] args) {
        // list of operators: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
        // operator precedence: http://cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

        int result = 1;
        System.out.println(result);

        result = result + 2;
        System.out.println(result);
        result = result - 1;
        System.out.println(result);
        result = result * 10;
        System.out.println(result);
        result = result / 5;
        System.out.println(result);

        result = result % 3;
        System.out.println(result);

        result++;
        System.out.println(result);
        result --;
        System.out.println(result);

        result += 2;
        System.out.println(result);
        result *= 10;
        System.out.println(result);
        result /= 10;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("Not an alien!");

        int topScore = 80;
        if (topScore != 100)    // ==, !=, >, >=, <, <=
            System.out.println("You don't have the top score.");
        int otherScore = 60;
        if ((topScore > otherScore) && (topScore < 100))    // &&, ||,
            System.out.println("Greater than otherScore and less than 100.");

        // ternary operator
        boolean wasAlien = isAlien ? true : false;

    }
}
