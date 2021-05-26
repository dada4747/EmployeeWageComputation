package com.bridgelabz;
import java.util.ArrayList;

public class Company {
    public final String company;
    public final int empRatePerHour;
    public final int workingDaysInMonth;
    public final int maximunWorkHours;
    int totalSalary;
    public ArrayList<Integer> dailyWage = new ArrayList<>();
    public Company( String company, int empRatePerHour, int workingDaysInMonth, int maximunWorkHours ) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.workingDaysInMonth = workingDaysInMonth;
        this.maximunWorkHours = maximunWorkHours;
    }
    public void getTotalWage(int totalSalary ) {
        this.totalSalary = totalSalary;
    }
    public void storeDailyWage(ArrayList<Integer> dailyWage ){
        this.dailyWage = dailyWage;
    }
}