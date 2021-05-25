package com.bridgelabz;

import java.util.ArrayList;

public class EmpWageComputationImpl implements EmpWageInterface {
    public int numOfCompany = 0;
    private ArrayList<Company> companyAraay;

    public EmpWageComputationImpl() {
        companyAraay = new ArrayList<Company>();
    }

    public void addCompany(String company, int wagePerHrs, int numOfWorkinDays, int maxHrsPerMonth) {
        companyAraay.add(numOfCompany, new Company(company, wagePerHrs, numOfWorkinDays, maxHrsPerMonth));
        numOfCompany++;
    }

    public void computEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyAraay.get(i).setTotalEmpWage(this.computEmpWage(companyAraay.get(i)));
            System.out.println(companyAraay.get(i));
        }
    }

    public int computEmpWage(Company company ){
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while(totalEmpHrs <= company.maxHrsPerMonth && totalWorkingDays < company.numOfWorkinDays) {

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
        return totalEmpHrs * company.wagePerHrs;
    }
}
