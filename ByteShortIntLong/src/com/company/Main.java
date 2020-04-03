package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 1000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("integer Min = " + myMinValue);
        System.out.println("integer Max = " + myMaxValue);
        System.out.println("busted = " + (myMaxValue + 1));
    }
}
