package com.bridgelabz.empwages;

public class Employeewage_Bulider {

	public static void main(String[] args) {
		System.out.println("Welcome to EmployeeWage Programme");
		int is_fulltime_present=1;
		int is_parttime_present=2;
		int wage_pr_hr=20;
		int working_hr;
		int days_in_month=20;
		int monthly_total_wage=0;
		int daily_wage_array[] = new int[20];
		int emp_check=(int)(Math.floor(Math.random()*10))%3;
		for (int i = 0; i < days_in_month; i++) {
		switch(emp_check) {
		     case 1:
		    	
		    	 working_hr=8;
		    	 
		     case 2:
		    	
		    	 working_hr=4;
		    	 
		     default:
		    	 System.out.println("Employee is Absent");
		    	 working_hr=0;
		}
		
                int daily_wage_array[i]=working_hr * wage_pr_hr;
		
		}
		for (int j = 0; j < days_in_month; j++) {
			int day = j + 1;
			System.out.println("Day " + day + " wage is " + daily_wage_array[j]);
			monthly_total_wage = monthly_total_wage + daily_wage_array[j];
		}
		System.out.println("\nMonthly wage is " + monthly_total_wage);
	   
   	    }
       
      }	
	      
	


