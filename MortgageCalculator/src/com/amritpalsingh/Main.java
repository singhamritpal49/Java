package com.amritpalsingh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static byte MONTH_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
       int principal =  (int) readNumber("Principal ($1K - $1M): ",1000,1_000_000);
      float annualInterest = (float) readNumber("Annual Interest Rate: ",1,30);
        byte years = (byte) readNumber("Period (Years): ",1,30);

        double mortgage = calculateMortgage(principal,annualInterest,years);
        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payment: " + mortgageFormat);

        System.out.println("PAYMENT SCHEDULED");
        System.out.println("-----------------");
        for(short month = 1; month <= years * MONTH_IN_YEAR;month++) {
            double balance = calculateBalance(principal,annualInterest,years,month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }

    }

    public static double readNumber(String prompt,double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while(true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if( value >= min && value <= max) {
                break;
            }
            System.out.println("Interest must be between " + min +" - "+ max +".");
        }
        return value;
    }
    public static double calculateBalance(
            int principal,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade
    ) {

        float monthlyInterest  = annualInterest / PERCENT / MONTH_IN_YEAR;
        short numberOfPayments = (short) (years * MONTH_IN_YEAR);

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1+ monthlyInterest,numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments)-1);
        return balance;

    }

    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years) {

        float monthlyInterest  = annualInterest / PERCENT / MONTH_IN_YEAR;
        short numberOfPayments = (short) (years * MONTH_IN_YEAR);

        double mortgage = principal
                * (monthlyInterest * Math.pow(1+ monthlyInterest, numberOfPayments))
                / (Math.pow(1+ monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }




}
