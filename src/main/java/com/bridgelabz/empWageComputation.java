package com.bridgelabz;
import java.lang.*;
public class empWageComputation {
    private static final int IS_PART_TIME = 1;
    private static final int IS_FULL_TIME = 2;

    public static void computEmpWage( ){

        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while(totalEmpHrs<=Company.maxHrsPerMonth && totalWorkingDays<Company.numOfWorkinDays) {

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
            System.out.println("Day : " + totalWorkingDays + " Emp Hrs : " + empHrs);

        }

        totalEmpWage =totalEmpHrs *Company.wagePerHrs;
        System.out.println("Total Emp Hrs is:"+totalEmpHrs);
        System.out.println("Company is: "+Company.company +", Total Emp Wage is :"+totalEmpWage);
   // return totalEmpWage;
}

    public static void main(String[] args){
        empWageComputation c = new empWageComputation();
        Company cap = new Company("Capgemini",20,2,10);
        c.computEmpWage();
        System.out.println("__________________________________________");
        Company dmart = new Company("Dmart",20,3,100);
        c.computEmpWage();

    }


}