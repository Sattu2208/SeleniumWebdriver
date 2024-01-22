package day2_Conditional_Statements;

import java.util.Scanner;

public class Nested_ifStatement {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three numbers");
		
		int a = s.nextInt(), b=s.nextInt(),c=s.nextInt(),d=s.nextInt(),e=s.nextInt();
		
		if (a>b) {
			
			if (a>c) {
				
				System.out.println("a is greates");
			}
		}
		
		else {
			
			if (b>c) {
				
				System.out.println("B is geatest");
			}
			
			else {
				
				System.out.println("C is greatest");
			}
		}
	}

}
