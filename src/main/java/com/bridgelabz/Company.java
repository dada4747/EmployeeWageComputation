package com.bridgelabz;

public class Company {
    public String company ;
    public int wagePerHrs ;
    public int numOfWorkinDays ;
    public int maxHrsPerMonth ;
    public int totalEmpWage;

    public Company(String company, int wagePerHrs, int numOfWorkinDays, int maxHrsPerMonth) {
        this.company = company;
        this.wagePerHrs = wagePerHrs;
        this.numOfWorkinDays = numOfWorkinDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return  "company Name ='" + company + '\'' +
                ", \nTotal Emploee Wage =" + totalEmpWage +
                 "\n---------------------------------------------------------------------" ;
    }

}