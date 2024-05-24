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
        StringBuilder answer = new StringBuilder();
        for (int i = start; i < stop; i+= step) {
                answer.append(i*i);
            }
        return answer.toString();
    }

    public static String getRange(int stop) {
        String result = "";
        for(int i = 0; i < stop; i++){
            result += i;
        }
        System.out.println("This is getRange with one parameter of int stop");
        return result;
    }

    public static String getRange(int start, int stop) {
        StringBuilder answer = new StringBuilder();
        for (int i = start; i < stop; i++) {
            answer.append(i);

        }
        System.out.println("This is getRange with 2 parameters, int start and int stop");
        return answer.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder answer = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            answer.append(i);

        }
        System.out.println("This is getRange with 3 parameters, start, stop, and step");
        return answer.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String answer = "";
        for (int i = start; i < stop ; i += step) {
            answer+=i*i;

        }
        return answer;
    }
}
