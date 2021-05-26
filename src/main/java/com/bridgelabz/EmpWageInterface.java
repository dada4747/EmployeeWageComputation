package com.bridgelabz;

public interface EmpWageInterface {
    int IS_EMP_FULL_TIME = 1;
    int IS_EMP_PART_TIME = 2;
    void addCompanyEmployee(String company, int empRatePerHour, int workingDaysInMonth, int maximunWorkHours);
    void getCalculationDailyWage();
    int getMonthlyWage(Company company);
}
