package Java.LearnProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>(3);
		
		
//		List.add(23);
//		List.add(34);
//		List.add(56);
//		List.add(354);
//		List.add(2312);
//		
//		System.out.println(List);
//		System.out.println(List.contains(23));
//		List.set(0, 55);
//		List.remove(2);
//		System.out.println(List);
//		System.out.println(List.contains(23));
		
		//input
		for(int i=0; i < 4; i++) {
			
			list.add(scan.nextInt());
		}
		
		//output
       for(int i=0; i < list.size(); i++) {
			
    	   System.out.println(list.get(i)); //pass index here, list[index] syntax will not work here
		}
       
       System.out.println(list);
	}

}
