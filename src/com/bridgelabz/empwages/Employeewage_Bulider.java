package com.bridgelabz.empwages;

public class Employeewage_Bulider {

	public static void main(String[] args) {
		System.out.println("Welcome to EmployeeWage Programme");
		int is_fulltime_present=1;
		int is_parttime_present=2;
		int daily_wage;
		int wage_pr_hr=20;
		int working_hr;
		int emp_check=(int)(Math.floor(Math.random()*10))%3;
		if(emp_check==is_fulltime_present) 
		{
			System.out.println("Employee is full time Present");
			working_hr=8;
		}
		else if(emp_check==is_parttime_present)
		{
			System.out.println("Employee is Present");
			working_hr=4;
		}
		else 
		{
			
			System.out.println("Employee is Abesent");
		working_hr=0;
	   }
	
       daily_wage=working_hr * wage_pr_hr;
       System.out.println("Employee daily wage is" + daily_wage);
			
	      }
	 }


