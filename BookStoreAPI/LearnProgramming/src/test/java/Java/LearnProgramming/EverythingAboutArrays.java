package Java.LearnProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class EverythingAboutArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Syntax
		// dataType[] variable_name = new dataType[size]
		//examples: store 5 empID's
		int[] empId = new int[5];
		//or 
		int[] empId1 = {102,104,104,234};
		
		int[] empId2; //declaration of array. "empId2" is getting defined in the stack (compile time)
		empId2 = new int[5]; //initialization: actually here object is being created in the heap memory (run time) : Dynamic memory allocation
		//array objects or any objects are created in heap memory. and "new" keyword is used to create objects.
		
		System.out.println(empId1[0]);
		
		String[] arr = new String[4];
		arr[0]="vikas";
		System.out.println(arr[0]);
		
		System.out.println("***********************************");
		Scanner scan = new Scanner(System.in);
		
		
		//Array of primitives
		int[] arr1 = new int[5];
		
		//input for array
		for( int i=0; i < arr1.length;i++) {
			
			arr1[i] = scan.nextInt();
		
		
		}
		
		System.out.println(Arrays.toString(arr1));
        
//      for( int i=0; i < arr1.length;i++) {
//			
//    	  System.out.print(arr1[i] + " ");	
//		
//		
//		}
       
		//for each loof
      
//      for(int num : arr1) { //for every element in array, print the element
//    	  
//    	  System.out.print(num + " "); // here num represents element of the array
//      }
		
		
		//array of objects
		
		String[] str = new String[4];
		
		for(int i=0;i < str.length;i++) {
			
			str[i]=scan.next();
		}
		
		System.out.println(Arrays.toString(str));
	}

}
