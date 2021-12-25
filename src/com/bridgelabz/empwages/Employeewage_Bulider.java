package com.bridgelabz.empwages;

public class Employeewage_Bulider {

	public static void main(String[] args) {
		System.out.println("Welcome to EmployeeWage Programme");
		int is_present=1;
		int daily_wage;
		int wage_pr_hr=20;
		int working_hr;
		int emp_check=(int)(Math.floor(Math.random()*10))%2;
		if(emp_check==is_present) 
		{
		      System.out.println("Employee is Present");
		      working_hr=8;
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


