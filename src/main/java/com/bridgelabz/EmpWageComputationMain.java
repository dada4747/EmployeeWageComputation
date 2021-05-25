package com.bridgelabz;
import java.lang.*;
public class EmpWageComputationMain {

    public static void main(String[] args){
        System.out.println("------------------Welcome Employee Wage Computation------------------");

        EmpWageComputationImpl empWageComputation = new EmpWageComputationImpl();
        empWageComputation.addCompany("Capgemini",20,2,50);
        System.out.println("--------------------------------------------------------------------");
        empWageComputation.addCompany("Barclays", 10, 4,100);
        empWageComputation.computEmpWage();
    }


}