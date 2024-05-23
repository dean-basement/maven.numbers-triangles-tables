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
        System.out.println("start: " + start + ", stop: " + stop + ", step: " + step);
        StringBuilder answers = new StringBuilder();
        for (int i = start; i < stop; i+= step) {
                answers.append(i*i);
            }
        return answers.toString();
    }

    public static String getRange(int start) {
        StringBuilder answer = new StringBuilder();
        answer.append(start);
        return answer.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder answer = new StringBuilder();
        for (int i = start; i < stop; i++) {
            answer.append(i);

        }
        return answer.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder answer = new StringBuilder();
        for (int i = start; i < stop; i+= step) {
            answer.append(i);

        }
        return answer.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
