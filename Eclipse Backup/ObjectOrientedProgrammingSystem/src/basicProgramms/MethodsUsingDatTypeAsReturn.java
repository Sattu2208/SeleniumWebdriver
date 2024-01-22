package basicProgramms;

public class MethodsUsingDatTypeAsReturn {
	
	public int div(int x , int y) {
		
		return(x/y);
	}
	
	public int mul(int x, int y) {
		
		return(x*y);
	}
	
	public static void main(String[] args) {
		//Object
		MethodsUsingDatTypeAsReturn m1 = new MethodsUsingDatTypeAsReturn();
		
		//Methods
		System.out.println("Div :"+m1.div(12, 4));
		System.out.println("Mult :"+m1.mul(12, 2));
		
		MethodULsingReturnTypeasVoid m2 = new MethodULsingReturnTypeasVoid();
		m2.add(12, 45);
		m2.sub(34, 12);
		
	}

}
