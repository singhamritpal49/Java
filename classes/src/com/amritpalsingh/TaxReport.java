package com.amritpalsingh;

public class TaxReport {
    private TaxCalculator2018 calculator;

    public TaxReport() {
        calculator = new TaxCalculator2018(100_00);
    }
    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
