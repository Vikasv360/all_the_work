package program;

import java.util.Scanner;

public class Sum {

	
	public static int checkSum(int n,int[] arr) {
		int len = arr.length;
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				int sum=arr[i] + arr[j];
				
				
				if(sum==n) {
					if(n%len!=0 && n%(len-1)==0) {
						return 2*2;
					}
				}
			}
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of n");
	    int n = sc.nextInt();
	    
	    System.out.println("Enter the size of an array");
	    int size =sc.nextInt();
	    
	    int arr[] = new int[size];
	    
	    System.out.println("Enter the element into an array");
	    for(int i=0;i<size;i++) {
	    	arr[i] = sc.nextInt();
	    }
	    
	    
	    int result = checkSum(n,arr);
	    System.out.println("Result : " +result);
	    
	    sc.close();
	}

}
