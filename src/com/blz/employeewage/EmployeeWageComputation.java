package com.blz.employeewage;

import java.util.Random;

public class EmployeeWageComputation {
	public static void main(String[] args) {
		
		Random random = new Random();
		int randomNum = random.nextInt(2);
		
		if(randomNum == 1)
			System.out.println("Employee present ");
		else
			System.out.println("Employee absent");
	}

}
