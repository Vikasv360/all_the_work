package javaProgrammingFromScratch;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "All cars have started from this point";
		String str1= "All Cars have started from this point";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf("a"));
		
		System.out.println(str.indexOf("a",str.indexOf("a") + 1));
		
		System.out.println(str.indexOf("from"));
		
		System.out.println(str.indexOf("hari")); //if the string is not present in a complete string then it returns -1
		
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.substring(4));
		
		System.out.println(str.substring(0, 13));
		
		String s= "   Good Morning   ";
		System.out.println(s.trim()); //removes white spaces before and after the string
		
		System.out.println(s.replace(" ", ""));
		
		String date="10-10-2024";
		System.out.println(date.replace("-", "/"));
		
		String test="Hello_world_test_automation";
		String[] arr = test.split("_");
		System.out.println(Arrays.toString(arr));
		
		
	}

}
