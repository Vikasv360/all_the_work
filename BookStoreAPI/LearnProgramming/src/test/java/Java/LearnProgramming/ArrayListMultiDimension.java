package Java.LearnProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMultiDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		//Initialize
		
		for(int i=0;i<3; i++) {
			
			list.add(new ArrayList<Integer>());
		}
		
		//add elements
		for(int i=0;i<3;i++) {
			for(int j=0; j<3;j++) {
				list.get(i).add(scan.nextInt());
			}
			
		}
		System.out.println(list);
	}
	

}
