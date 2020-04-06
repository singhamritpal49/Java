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

         int principal = 0;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Principal ($1K - $1M): ");
             principal = scanner.nextInt();
             if(principal >= 1000 && principal <=1_000_000){
                 break;
             }
            System.out.println("Please enter value between 1,000 - 1,000,000.");
        }



        float annualIntRate = 0;
        while(true) {
            System.out.print("Annual Interest Rate: ");
            annualIntRate = scanner.nextFloat();
            if( annualIntRate >= 1 && annualIntRate <= 30) {
                break;
            }
            System.out.println("Interest must be between 1 - 30");
        }
        float monthlyInterest  = annualIntRate / PERCENT / MONTH_IN_YEAR;



        int years = 0;
        while(true) {
            System.out.print("Period (Years): ");
             years = scanner.nextInt();
             if(years >= 1 && years <= 30) {
                 break;
             }
            System.out.println("Year must be between 1 - 30");
        }
        int numberOfPayments = years * MONTH_IN_YEAR;



        double mortgage = principal
                * (monthlyInterest * Math.pow(1+ monthlyInterest, numberOfPayments))
                / (Math.pow(1+ monthlyInterest, numberOfPayments) - 1);

//        System.out.print("Yearly Property Taxes: ");
//        int tax = scanner.nextInt();
//        int taxByMonth = tax / MONTH_IN_YEAR;
//
//        System.out.print("Yearly Insurance: ");
//        int insurance = scanner.nextInt();
//        int insuranceByMonth = insurance / MONTH_IN_YEAR;

//        mortgage = mortgage + taxByMonth + insuranceByMonth;

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:" + mortgageFormat);



    }
}
