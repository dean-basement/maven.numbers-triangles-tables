package com.github.curriculeon;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder answers = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if(i % 2 == 0){
                answers.append(i);
            }
        }
        return answers.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder answers = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if(i % 2 != 0){
                answers.append(i);
            }
        }
        return answers.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        //to find if a number is square you must first get sqrt of number
        //if the sqrt is an int, the number is square
        System.out.println("start: " + start + ", stop: " + stop + ", step: " + step);
        StringBuilder answers = new StringBuilder();
        for (int i = start; i <= stop; i+= step) {
            double sqrt = Math.sqrt(i);
            double floor = Math.floor(sqrt);
            System.out.println("The square root of " + i + ": " + sqrt + ", Floor: " + floor);
            if(sqrt == Math.floor(sqrt)){
                System.out.println(i + " is a perfect square");
                System.out.println(i + " was appended");
                answers.append(i);
            }
        }
        return answers.toString();
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
