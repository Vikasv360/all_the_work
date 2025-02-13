package javaProgrammingFromScratch;

public class PrimeNumberOrNot {

	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void getPrimeNumber(int num) {
	
		for(int i=2;i<num;i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {0,1, 2, 3, 10, 6, 17,-2,-17};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i] + " is a prime number : " + isPrimeNumber(arr[i]));
		}
		
		getPrimeNumber(20);
		
	}

}
