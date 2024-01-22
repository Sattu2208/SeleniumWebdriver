package day3_Loops;

import java.util.Scanner;

public class Multiplication_TableusingForLoop {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a number to Print its multiplication ");
		
		int num = s.nextInt();
		System.out.println("Multiplication of Table of "+num+"");
		
		for(int i=1;i<=10;i++) 
		{
			System.out.println(num+"*"+i+"="+(num*i));
		}
		
		s.close();
	}

}
