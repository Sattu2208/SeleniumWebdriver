package basicProgramms;

import java.util.Scanner;

public class MethodULsingReturnTypeasVoid {
	
	public void add(int a, int b)
	{
		System.out.println("Add :"+(a+b));
	}
	
	public void sub(int a, int b)
	{
		System.out.println("Sub :"+(a-b));
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter two numbers :");
		int num1 =s.nextInt(),num2 = s.nextInt();
		
		//object
		//Class name Object = new ClassNAme/Constructor()
		
		MethodULsingReturnTypeasVoid a = new MethodULsingReturnTypeasVoid();
		//calling methods
		a.add(num1,num2);
		a.sub(num1,num2);
		
	}
}
