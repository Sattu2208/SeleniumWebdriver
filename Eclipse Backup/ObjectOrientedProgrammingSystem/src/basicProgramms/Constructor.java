package basicProgramms;

import java.util.Scanner;

public class Constructor {

	//Instance variable
	int a,b,c;
	String d;
	
	Constructor(int a1 , int b1, int c1, String d1){
		
		this.a=a1;
		this.b=b1;
		this.c=c1;
		this.d=d1;
	}
	
	public void add() {
		
		System.out.println("Addition"+(a+b+c));
	}
    public void sub() {
		
		System.out.println("subtraction"+(a-b));
	}
    
    public void div() {
		
		System.out.println("Division"+(a/b));
	}
    public void mul() {
		
		System.out.println("Multiplication"+(a*b));
	}
    public void name() {
		
		System.out.println("Customer Name "+d);
	}    
    public static void main(String[] args) {
    	
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter three numbers");
    	int num1=s.nextInt(),num2 = s.nextInt(),num3= s.nextInt();
    	String name=s.next();
    	//Object
    	Constructor c= new Constructor(num1,num2,num3, name);
    	
    	//Calling methods
    	c.add();
    	c.div();
    	c.sub();
    	c.mul();
    	c.name();
    	
    	
    }
	
	
	
}
