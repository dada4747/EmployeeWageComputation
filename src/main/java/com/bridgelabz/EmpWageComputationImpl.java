package com.bridgelabz;
import java.util.ArrayList;

public class EmpWageComputationImpl implements EmpWageInterface {
    public static int empHours = 0;
    private ArrayList<Company> companyArray;
    private int numOfCompany = 0;
    //Constructor Of Class
    public EmpWageComputationImpl(){
        companyArray = new ArrayList<Company>();
    }
    //Method for add companies
    public void addCompanyEmployee(String company, int empRatePerHour, int workingDaysInMonth, int maximunWorkHours){
        Company comp = new Company( company, empRatePerHour, workingDaysInMonth, maximunWorkHours);
        companyArray.add(comp);
        numOfCompany++;
    }
    //method for getting employee hours for per day
    public int getWorkingHours(int empCheck){
        switch (empCheck){
            case IS_EMP_FULL_TIME:
                empHours = 8 ;
                break ;
            case IS_EMP_PART_TIME:
                empHours = 4 ;
                break ;
            default:
                empHours=0  ;
        }
        return empHours;
    }
    //method for calculate monthly employee wage
    public int getMonthlyWage(Company company ){
        int totalEmpHours = 0, dailyWage = 0, totalSalary = 0, totalWorkingDays = 0;
        ArrayList<Integer> dailyWageArray = new ArrayList<>(); //Declare arraylist for store daily wages day by da
        while (totalEmpHours < company.maximunWorkHours && totalWorkingDays < company.workingDaysInMonth ) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            empHours = getWorkingHours(empCheck);//call method with passing argument and store value in instace var empHours
            dailyWage = company.empRatePerHour * empHours;//for count daily wage
            totalSalary = totalSalary + dailyWage; //count total salary
            dailyWageArray.add(totalSalary); // store total salary into arraylist
            totalEmpHours += empHours;
            ++totalWorkingDays;
        }
        if( totalEmpHours > company.maximunWorkHours ){
            company.getTotalWage(totalSalary);
        }
        company.storeDailyWage(dailyWageArray);
        company.getTotalWage(totalSalary);
        return 0;
    }

    //method for clculate the result and get the output
    public void getCalculationDailyWage(){
        for (int i = 0; i < numOfCompany; i++){
            getMonthlyWage(companyArray.get(i));    //call getMonthlyWage method with passing element from companyArray
            System.out.println("Company: " + companyArray.get(i).company + " Employee Wage :" + companyArray.get(i).totalSalary);
            int oldWage = 0;
            System.out.println("Day\t\t\tWage\t\t\tTotal Wage");
            for (int j = 0; j < companyArray.get(i).dailyWage.size(); j++){
                System.out.println("Day: " + j + "\t\t"+(companyArray.get(i).dailyWage.get(j)-oldWage) + "\t\t\t\t"+companyArray.get(i).dailyWage.get(j));
                oldWage = companyArray.get(i).dailyWage.get(j);
            }
            System.out.println("______________________________________");
        }
    }
}
