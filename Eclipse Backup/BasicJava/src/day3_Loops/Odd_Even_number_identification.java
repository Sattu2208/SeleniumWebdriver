package day3_Loops;

import java.util.Scanner;

public class Odd_Even_number_identification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Identify entered number is even or Odd");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		
	   int i = s.nextInt();
	   
	   if (i%2==1) {
		   
		   System.out.println("Enter number is odd");
	   }
	   else {
		   System.out.println("Enter number is even");
	   }
	}

}
