package program;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,5};
		int sum=0;
		int sum1=0;
		
		for(int i =0;i<arr.length;i++) {
			sum =sum+arr[i];
		}
		
		
		for(int i=0;i<=5;i++) {
			sum1=sum1+i;
			
		}
		int missNum = sum1-sum;
		System.out.println("The missing number in the given array is : " + missNum);
	}

}
