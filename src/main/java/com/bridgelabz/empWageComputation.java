package com.bridgelabz;
//UC-2-Caclulate daily employee Wage per hrs 20 / 8 hrs per day
public class empWageComputation {
    public static void main(String args[]){
        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
        final int WAGE_PER_HR = 20;
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_PART_TIME){
            empHrs = 4;
        }
        else if (empCheck == IS_FULL_TIME){
            empHrs = 8;
        }
        else {
            empHrs = 0;
        }
        empWage = WAGE_PER_HR * empHrs;
        System.out.println("Employee Wage :"+ empWage);
    }
}