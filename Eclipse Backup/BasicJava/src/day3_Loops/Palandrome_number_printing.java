package day3_Loops;

import java.util.Scanner;

public class Palandrome_number_printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Checking a number is palandrome or not");
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int r,d=0;
		
		for(int i=a;i>0;) {
			
			r= i%10;
			d=d*10+r;
		    i = i/10;
		}
		
		if (d==a) {
			
			System.out.println("Entered number is palandrome");
		}
		else {
			
			System.out.println("Entered Number is not palandrome");
		}

	}

}
