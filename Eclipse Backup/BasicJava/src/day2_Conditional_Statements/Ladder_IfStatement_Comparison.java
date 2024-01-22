package day2_Conditional_Statements;

import java.util.Scanner;

public class Ladder_IfStatement_Comparison {
	public static void main (String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the three number");
		float a =s.nextFloat(), b=s.nextFloat(), c= s.nextFloat();
		
		
        if (a>b && a>c) {
        	
        	System.out.println("a is greater");
        }
        else if (b>c && b>a) {
        	
        	System.out.println("b is greater");
        }
        else if (c>a && c>b) {
        	
        	System.out.println("C is greater");
        }
        else {
        	
        	System.out.println("numbers are equal");
        }
        	
        	
	}

}
