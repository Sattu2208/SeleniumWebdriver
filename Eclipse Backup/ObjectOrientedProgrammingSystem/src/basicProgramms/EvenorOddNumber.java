package basicProgramms;

import java.util.Scanner;

public class EvenorOddNumber {
	
	public static void main (String[] args)
	
	{
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a number");
		int i = s.nextInt();
		
		if (i%2==1 ){
			
		 System.out.println("Entered number is odd");
		}
		
		else {
			
			System.out.println("Entered number is even");
		}
			
		
		
	}

}
