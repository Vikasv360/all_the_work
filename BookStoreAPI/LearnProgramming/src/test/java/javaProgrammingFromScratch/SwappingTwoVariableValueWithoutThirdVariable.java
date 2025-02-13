package javaProgrammingFromScratch;

public class SwappingTwoVariableValueWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=15;
		int y=45;
		
		//1. With using 3rd variable =t
	
		
//		int t;
//		t=x;//t=15
//		x=y;//x=45
//		y=t;//y=15
		
		//2. Without using 3rd variable: + operator
		
//		x=x+y; // x=60
//		y=x-y; // y=15
//		x=x-y; // x=45
//		
		//3. Without using 3rd variable: * operator
		
		x=x*y;
		y=x/y;
		x=x/y;
		
		System.out.println(x);
		System.out.println(y);
	}

}
