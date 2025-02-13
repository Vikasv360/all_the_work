package javaProgrammingFromScratch;

public class FindMissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,5};
		int sum1 =0;
		int sum2=0;
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];
		}
		System.out.println(sum1);
		
		for(int i=0;i<=5;i++) {
			sum2=sum2+i;
		}
		System.out.println(sum2);
		int missingNum= sum2-sum1;
		System.out.println("The missing number in a given array : " + missingNum);
	}

}
