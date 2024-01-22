package Abstraction;

abstract class RBI{
	//non abstract method
	public void neft(){
		System.out.println("NEFT timing is from 10AM to 6 PM");
	}
    //abstract method 
	abstract public int roi();
	
}

class axis extends RBI{
	
	public int roi(){
		return 7;
	}
}
class HDFC extends RBI{
	
	public int roi(){
		return 8;
	}
}
public class AbstractClass_Example {

	public static void main(String[] args) {
	axis a = new axis();
	System.out.println("Welcome to Axis bank");
	System.out.println("ROI of axis is :"+a.roi()+"%");
	a.neft();
	
	HDFC h =new HDFC();
	System.out.println("Welcome to HDFC bank");
	System.out.println("ROI of axis is :"+h.roi()+"%");
	h.neft();
	

	}

}
