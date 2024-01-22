package Inheritance;

class ParentClass{
	
	public void sqaure(int x) {
		
		System.out.println("Sqaure is : "+Math.pow(x, 2));
	}
}

class Child1 extends ParentClass{
	
	public void cube(int x) {
		
		System.out.println("Cube is : "+Math.pow(x, 3));
	}
}

class Child2 extends Child1{
	
	public void simpleinterest(int p,int r, int n) {
		
		System.out.println("Simple Interest is  : "+((p*n*r)/100));
	}
}


public class MultilevelInheritance {
	
	public static void main(String [] args) {
		
		Child2 c = new Child2();
		
		c.sqaure(3);
		c.cube(6);
		c.simpleinterest(12, 14, 16);
		
	}
	
}
