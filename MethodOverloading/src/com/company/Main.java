package com.company;

public class Main {

    // accessible to methods in class
    // final means unchangeable; it's constant, and by convention in all caps
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {

        calculateScore("Virginia", 8);
        calculateScore(22);
        calculateScore();

        System.out.println(getDuration(65, 45));
        System.out.println(getDuration(100));
        System.out.println(getDuration(-8));

    }

    // can use same method name if parameters are different
    // parameters must be different if same method name, even if return type different
    public static int calculateScore(String name, int score) {
        System.out.println(name + " scored " + score);
        return score * 10;
    }

    public static int calculateScore(int score) {
        System.out.println("Someone scored " + score);
        return score * 5;
    }

    public static void calculateScore() {
        System.out.println("No name or score");
    }

    public static String getDuration(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static String getDuration(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDuration(minutes, remainingSeconds);
    }
}
