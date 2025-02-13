package Java.LearnProgramming;

import java.util.Arrays;

public class SwappingArrayObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,3, 34,45,67};
		System.out.println("Before swapping : " + Arrays.toString(arr));
		swap(arr, 1 ,4);
		System.out.println("After swapping : " + Arrays.toString(arr));
	}

	static void swap(int[] arr, int index1, int index2) {
		
		int temp = arr[index1];
		arr[index1] =arr[index2];
		arr[index2] = temp;
	}

}
