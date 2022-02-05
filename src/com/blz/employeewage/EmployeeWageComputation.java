package com.blz.employeewage;

import java.util.Random;

public class EmployeeWageComputation {
	public static void main(String[] args) {
		
		int empHrs = 0;
		int wagePerHour = 20; 
		Random random = new Random();
		int randomNum = random.nextInt(2);
		
		if(randomNum == 1)
		{
			System.out.println("Employee present ");
			empHrs = 8;
		}
		else
			System.out.println("Employee absent");
		
		double salary = empHrs * wagePerHour ;
		System.out.println("Employee wage: "+salary);
	}

}
