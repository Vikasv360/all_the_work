package Java.LearnProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDeminsionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[][] arr = new int[3][2];
		System.out.println(arr.length); // no of rows : gives 3

		// input for multidimensional array
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {

				arr[row][col] = scan.nextInt();
			}
		}

//		// Output
//		for (int row = 0; row < arr.length; row++) {
//
//			for (int col = 0; col < arr[row].length; col++) {
//
//				//this prints the input in same line
//				System.out.print(arr[row][col] + " ");
//			}
//			
//			//after one row complete to print the other row in another line/new line
//			System.out.println(" ");
//			
//		}
		
		//As here we are converting into string, 
		for(int row = 0; row < arr.length; row++) {
			
			System.out.println(Arrays.toString(arr[row]));
			
		}
		
		
		
	}

}
