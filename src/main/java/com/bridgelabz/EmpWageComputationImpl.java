package com.bridgelabz;

public class EmpWageComputationImpl {
     private static final int IS_PART_TIME = 1;
    private static final int IS_FULL_TIME = 2;
    public int numOfCompany = 0;
    private Company[] companyAraay;

    public EmpWageComputationImpl(){
        companyAraay = new Company[5];
    }

    void addCompany(String company, int wagePerHrs, int numOfWorkinDays, int maxHrsPerMonth){
        companyAraay[numOfCompany] = new Company(company, wagePerHrs, numOfWorkinDays, maxHrsPerMonth);
        numOfCompany++;
    }

    void computEmpWage(){
        for (int i = 0; i < numOfCompany; i++){
            companyAraay[i].setTotalEmpWage(this.computEmpWage(companyAraay[i]));
            System.out.println(companyAraay[i]);
        }

    }

    public static int computEmpWage(Company company ){

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
