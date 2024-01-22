package day2_Conditional_Statements;

import java.util.Scanner;

public class Login_java {

	public static void main(String[] args) {
	
		Scanner s = new Scanner (System.in);
		System.out.println("Enterusername and passward");
		String usn = s.next(), pwd = s.next();
		
		if(usn.equals("abc") && pwd.equals("xyz@123"))
		{
			
			System.out.println("Login is succesful");
		}
		
		else 
		{
			
			System.out.println("Login is failed");
		}
		

	}

}
