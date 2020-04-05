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

        if(principal < 100) {
            System.out.print("Please enter values greater than 100: ");
            principal = scanner.nextInt();
        }

        System.out.print("Annual Interest Rate: ");
        float annualIntRate = scanner.nextFloat();
        float monthlyInterest  = annualIntRate / PERCENT / MONTH_IN_YEAR;

        System.out.print("Period: ");
        int years = scanner.nextInt();
        int numberOfPayments = years * MONTH_IN_YEAR;



        double mortgage = principal
                * (monthlyInterest * Math.pow(1+ monthlyInterest, numberOfPayments))
                / (Math.pow(1+ monthlyInterest, numberOfPayments) - 1);

        System.out.print("Yearly Property Taxes: ");
        int tax = scanner.nextInt();
        int taxByMonth = tax / MONTH_IN_YEAR;

        System.out.print("Yearly Insurance: ");
        int insurance = scanner.nextInt();
        int insuranceByMonth = insurance / MONTH_IN_YEAR;

        mortgage = mortgage + taxByMonth + insuranceByMonth;

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:" + mortgageFormat);
    }
}
