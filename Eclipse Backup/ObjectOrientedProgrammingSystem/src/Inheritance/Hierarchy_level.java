package Inheritance;

class A //Parent Class
{
	public void circle(int r) 
	{	
		System.out.println("\nArea of Circle: "+(3.14*r*r));
	}
}

class B extends A //Child class

{
	public void rectangle(int h,int l) 
	{	
		System.out.println("\nArea of Rectangle: "+(h*l));
	}
}

class C extends A //Child class

{
	public void sqaure(int s) 
	{	
		System.out.println("\nArea of Sqaure: "+(s*s));
	}
}

public class Hierarchy_level {

	
	public static void main(String [] args) {
		
		
		B b = new B();
		
	   System.out.println("Methods of child class1: ");
	   b.circle(12);
	   b.rectangle(12,14);
	   
		C c = new C();
		System.out.println("Methods of child class2: ");
		
		 c.circle(12);
		 c.sqaure(12);		
	}
}
