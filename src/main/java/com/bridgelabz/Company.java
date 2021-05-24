package com.bridgelabz;

public class Company {
    public static String company ;
    public static int wagePerHrs ;
    public static int numOfWorkinDays ;
    public static int maxHrsPerMonth ;
   // private int totalEmpWage;
    public Company(String company, int wagePerHrs, int numOfWorkinDays, int maxHrsPerMonth) {
        this.company = company;
        this.wagePerHrs = wagePerHrs;
        this.numOfWorkinDays = numOfWorkinDays;
        this.maxHrsPerMonth = maxHrsPerMonth;

    }

    @Override
    public String toString() {
        return "Company: " + company + "\n Total Wage Of Employee= " + empWageComputation.computEmpWage();
    }
}
