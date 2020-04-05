package com.amritpalsingh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;
        // Principal
        // Annual Interest Rate
        // Period
        // Mortgage


        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualIntRate = scanner.nextFloat();
        float monthlyInterest  = annualIntRate / PERCENT / MONTH_IN_YEAR;

        System.out.print("Period: ");
        int years = scanner.nextInt();
        int numberOfPayments = years * MONTH_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1+ monthlyInterest, numberOfPayments))
                / (Math.pow(1+ monthlyInterest, numberOfPayments) - 1);
        String mortageformat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:" + mortageformat);
    }
}
