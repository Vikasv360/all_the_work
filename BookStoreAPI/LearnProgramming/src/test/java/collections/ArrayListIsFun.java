package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIsFun {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		nums.add(3);
		nums.add(34);
		nums.add(45);
		nums.add(12);
		nums.add(65);
		
		//We can directly print an arrayList
		System.out.println(nums);
		
		//To print individual value of an arrayList convert it to List interface 
		System.out.println(nums.get(0));
		System.out.println(nums.indexOf(3));
		
		

	}

}
