package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetIsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> nums =  new HashSet<>();
		nums.add(34);
		nums.add(34);
		nums.add(45);
		nums.add(12);
		nums.add(65);
		
		System.out.println(nums);
		
		Set<Integer> nums1 =  new TreeSet<Integer>();
		
		nums1.add(104);
		nums1.add(34);
		nums1.add(45);
		nums1.add(12);
		nums1.add(65);

		System.out.println(nums1);
		
		Iterator<Integer> values = nums.iterator();
		while(values.hasNext()) {
			System.out.println(values.next());
		}
		
	}

}
