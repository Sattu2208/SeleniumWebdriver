package day3_Loops;

import java.util.Scanner;

public class For_Loops {
	
	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting Range");
		int Start=s.nextInt();
		System.out.println("Enter End Range");
		int End = s.nextInt();
		
		for(int i = Start; i<=End; i++)
		{
			System.out.println(i);
		}
		
		
	}

}
