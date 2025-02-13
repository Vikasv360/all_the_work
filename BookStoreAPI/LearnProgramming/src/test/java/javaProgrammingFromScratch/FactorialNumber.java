package javaProgrammingFromScratch;

public class FactorialNumber {
	
	public static int isFactorial(int num) {
		
		int fact=1;
		if(num==0) {
			return 1;
		}
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}

	//2. With recursive function: A function is calling itself
	
	public static int fact(int num) {
		if(num==0)
			return 1;
		
		else
		return (num * fact(num-1));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isFactorial(4));
		System.out.println(isFactorial(0));
		System.out.println(isFactorial(1));
		System.out.println(isFactorial(-1));
		
		System.out.println("*****************************");
		
		System.out.println(fact(0));
		System.out.println(fact(1));
		System.out.println(fact(5));
		
	}

}
