package com.amritpalsingh;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        // Formatting Currency
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//    String result = currency.format(1234568.971);
//        System.out.println(result);

        // Formatting Percentage;
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(0.1);
//        System.out.println(result);

//        or

        String result = NumberFormat.getPercentInstance().format(0.2);
        System.out.println(result);

    }
}
