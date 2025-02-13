package Java.LearnProgramming;

import java.util.Arrays;

public class PassingFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {34,45,67,78,34};
		System.out.println(Arrays.toString(nums));
		change(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	static void change(int[] arr) {
		arr[0] = 99;
	}
	
	//Here the original value arr[0] which was 34 is changed to 99.
	//this behavior is called as mutability
	//Arrays are mutable in JAVA: mutable means that we change the object

}
