package ProgrammingQuestions;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//There is no function/method to reverse a string as string is an immutable object.
//		String str = "VikasV";
//		
//		//Creating a empty string to store the new value of string
//		String rev= "";
//		
//		//This gives the length of the String
//		int lnt = str.length();
//		
//		//for loop to iterate 
//		//length of the string is 6, but we have to start from 5 and end at 0 index value "lnt-1" is used.
//		//i >=0 refers that the i value reaches till "0" and include "0" as well
//		//i-- refers to the decrement of i value till 0
//		for(int i=lnt-1;i>=0;i--) {
//			
//			// str.charAt(i) gives the character value at that particular index 
//			//and empty "rev" variable is appended with that and stored in "rev" variable.
//			rev= rev + str.charAt(i);
//		}
//
//		//the rev value is printed outside the for loop to avoid the print of value at every index value
//		System.out.println(rev);
		
		
		//To overcome the immutable nature of the string objects we have StringBuffer and StringBuilders
		
		//StringBuffer:
		//it is a class of String which provides the functionalities of a String
		//It may have a charater and subStrings inserted in the middle  or append to the end.
		
		String name = "Adam";
		
		StringBuffer strg = new StringBuffer(name);
		
		System.out.println(strg.reverse()); 

		
		
	}

}
