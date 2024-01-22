package day2_Conditional_Statements;

import java.util.Scanner;

public class AreausingSwitchStatement {

	public static void main(String[] args) {

    Scanner s = new Scanner (System.in);
    
    System.out.println("***** Area ********");
		  
	System.out.println("Enter 1 for Area of Circle.\nEnter 2 for Area of Rectanle.\nEnter 3 for area of triangle.\nEnter 4 for Area of Sqauer");
	
	int choice = s.nextInt();
	
	switch(choice){
		
		case 1:	
	    System.out.println("\nCircle");
		System.out.println("Enter a radius of circle");
		float r= s.nextFloat();
		float pi = 3.14f;
		System.out.println("Area of Circle is"+(pi*r*r));
	    break;
	    
	    case 2:	
		System.out.println("\nRectangle");
		System.out.println("Enter a length of rectangle");
		float l= s.nextFloat();
		System.out.println("Enter a breadth of rectangle");
		float b= s.nextFloat();
		System.out.println("Area of Circle is"+(l*b));
		break;
		    
		case 3:	
	    System.out.println("\nTriangle");
		System.out.println("Enter a base of triangle");
		float b1= s.nextFloat();
		System.out.println("Enter a height of triangle");
		float h = s.nextFloat();
		System.out.println("Area of Triangle is "+(0.5*b1*h));
	    break;

		case 4:	
		    System.out.println("\nSqaure");
		    System.out.println("Enter a side of sqaure");
			float s1= s.nextFloat();
			System.out.println("Area of Sqauer is "+(s1*s1));
		    break;		    
		
		default:
		System.out.println("Invaid Selection");
	}
	
	}

}
