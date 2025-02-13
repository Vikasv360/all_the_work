package program;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfTwoNum {
	
	public static ArrayList<int[]> sumTwo(int n, int[] arr) {
		
		ArrayList<int[]> pairs = new ArrayList<>();
		
		int len = arr.length;
	
		for(int i =0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				int sum = arr[i] + arr[j];
				
				if(sum == n) {
					pairs.add(new int[] {arr[i],arr[j]});					
				}
			}
		}
		
	return pairs;	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		System.out.println("Enter the elements in the array");
		
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrayList<int[]> result = sumTwo(n,arr);
		
		for(int[] pair : result) {
			System.out.println(pair[0] + " : " + pair[1]);
		}
	
	}

}
