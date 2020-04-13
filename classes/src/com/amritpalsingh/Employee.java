package com.amritpalsingh;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate) {
        this.baseSalary = baseSalary;
        this.hourlyRate = hourlyRate;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + ( hourlyRate * extraHours);
    }

    public int calculateWage() {
        return baseSalary;
    }

    public void setBaseSalary( int baseSalary ) {
        if(baseSalary <= 0) {
            throw new IllegalArgumentException("Invalid Salary");
        }
        this.baseSalary = baseSalary;
    }
    private int getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if(hourlyRate <= 0 ) {
            throw new IllegalArgumentException("Invalid Hourly Rate");
        }
        this.hourlyRate = hourlyRate;
    }
    private int getHourlyRate() {
        return hourlyRate;
    }


}
