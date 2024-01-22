package day1_BasicProgram;

import java.util.Scanner;

public class CalculatorusingScanner {
	
	public static void main(String[] args) {
		//Note : Control+shift+O 		
		Scanner s = new Scanner(System.in);		
		System.out.println("Enter first number");		
		float a = s.nextFloat();				
		System.out.println("Enter Second Number");
		
		float b = s.nextFloat();
		
		System.out.println( "Sum"+(a+b));
		System.out.println( "Sub"+(a-b));
		System.out.println( "Div"+(a/b));
		System.out.println( "Mult"+(a*b));
		s.close();
		
	}

}
