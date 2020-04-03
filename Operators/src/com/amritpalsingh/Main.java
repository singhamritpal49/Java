package com.amritpalsingh;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3;
        System.out.println(result);
        int previousResult = result;
        System.out.println("PreviousResults = " + previousResult);
        result = result - 1;
        result  = result * 10;

        result = result / 5;
        System.out.println(result);
    }
}
