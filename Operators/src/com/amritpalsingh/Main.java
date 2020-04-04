package com.amritpalsingh;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3;
        System.out.println(result);
        int previousResult = result;
//        System.out.println("PreviousResults = " + previousResult);
        result = result - 1;
        result  = result * 10;

        result = result / 5;
//        System.out.println(result);

        // if then
        boolean isAlien = false;
        if (isAlien) {
            System.out.println("Hello World!");
        } else {
            System.out.println("YOYO");
        }

        int topScore = 100;
        int lowScore = 1;
        if (topScore == 10 || lowScore == 1) {
            System.out.println("Your got the highest Score");
        }

        // Challenge
        double firstValue = 20.00;
        double secondValue = 80.00;
        double totalValue = firstValue + secondValue * 100.00d;
        double remainderValue = totalValue % 40;

        }

    }

