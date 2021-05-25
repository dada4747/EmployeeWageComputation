package com.bridgelabz;

public interface EmpWageInterface {
    int IS_PART_TIME = 1;
    int IS_FULL_TIME = 2;
    void addCompany(String company, int wagePerHrs, int numOfWorkinDays, int maxHrsPerMonth);
    void computEmpWage();
}
