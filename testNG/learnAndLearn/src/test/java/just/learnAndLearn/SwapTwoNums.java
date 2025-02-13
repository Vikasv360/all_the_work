package just.learnAndLearn;

public class SwapTwoNums {
	
	public static void main(String[] args) {
		
	int a=10;
	int b=15;
	
	System.out.println("The value of a & b before swap : " + a + " : " + b);
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("The value of a & b after swap : " + a + " : " + b);	
		
	}

}
