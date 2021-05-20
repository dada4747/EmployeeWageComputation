package com.bridgelabz;
//switch case
public class empWageComputation {
    private static final int IS_PART_TIME = 1;
    private static final int IS_FULL_TIME = 2;
    private static final int WAGE_PER_HR = 20;
    private static final int NUM_OF_WORKING_DAYS = 20;

    public static void main(String args[]){
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;

        for (int day=1; day <= NUM_OF_WORKING_DAYS; day++) {
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
            empWage = WAGE_PER_HR * empHrs;
            totalEmpWage += empWage;
            System.out.println("Employee Wage of Day "+ day +" :" + empWage);
        }
        System.out.println("Total Emp Wage is :"+totalEmpWage);
    }
}