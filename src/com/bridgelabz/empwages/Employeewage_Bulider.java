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
		switch(emp_check) {
		     case 1:
		    	 System.out.println("Employee is full time present");
		    	 working_hr=8;
		    	 
		     case 2:
		    	 System.out.println("Employee is part time present");
		    	 working_hr=4;
		    	 
		     default:
		    	 System.out.println("Employee is Absent");
		    	 working_hr=0;
		}
       daily_wage=working_hr * wage_pr_hr;
       System.out.println("Employee daily wage is" + daily_wage);
			
	      }
	 }


