package com.bridgelabz;

public class empWageComputation {
    private static final int IS_PART_TIME = 1;
    private static final int IS_FULL_TIME = 2;
    private static final int WAGE_PER_HR = 20;
    private static final int NUM_OF_WORKING_DAYS = 20;
    private static final int MAX_HRS_IN_MONTH = 100;

    public static void main(String args[]){
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day :"+totalWorkingDays+"Emp Hrs : "+empHrs);

        }
        totalEmpWage = totalEmpHrs * WAGE_PER_HR;
        System.out.println("Total Emp Hrs is:"+totalEmpHrs);
        System.out.println("Total Emp Wage is :"+totalEmpWage);
    }
}