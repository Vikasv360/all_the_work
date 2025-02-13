package javaProgrammingFromScratch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LargestSmallestInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {-65,-99,145,456,789,-1023};
		
		int largest = num[0];
		int smallest = num[0];
		
		for(int i=1;i<num.length;i++) {
			if(num[i]>largest) {
				largest = num[i];
			}
			else if(num[i]<smallest) {
				smallest = num[i];
			}
		}

		System.out.println("The given array is : " + Arrays.toString(num));
		System.out.println("The largest number in an array is " + largest);
		System.out.println("The smallest number in an array is " + smallest);
	}

}
