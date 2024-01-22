package day2_Conditional_Statements;

import java.util.Scanner;

public class Login_java_nestedIf {

		public static void main(String[] args) {
		
			Scanner s = new Scanner (System.in);
			System.out.println("Enterusername ");
			String usn = s.next();
			
			if(usn.equals("abc") )
			{
				
				System.out.println("Enter your password");
				
				String pwd = s.next();
				
				if (pwd.equals("xyz@123")) {
					
					System.out.println("Login is succesful");
				}
				else {
					
					System.out.println("Passward is wrong");
				}
			}
			
			else 
			{
				System.out.println("Username is wrong");
				System.out.println("Login is failed");
			}
			

		}
	
}
