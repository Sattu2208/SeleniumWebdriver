package day2_Conditional_Statements;

import java.util.Scanner;

public class If_Statement {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter you Age");
		
		int age = s.nextInt();
		if(age >= 18 && age <=60 ) {
			
			System.out.println("Eligible for License");
		}
		else {
			System.out.println("Not eligible for license");
		}
	} 

}
