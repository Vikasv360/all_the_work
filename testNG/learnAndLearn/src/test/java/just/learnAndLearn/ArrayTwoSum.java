package just.learnAndLearn;

import java.util.HashMap;
import java.util.Map;

public class ArrayTwoSum {

	public static int[] getArray(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap();

		for (int i = 0; i < nums.length; i++) {
			int comp = target - nums[i];

			if (map.containsKey(comp)) {
				return new int[] { map.get(comp), i };
			} else {
				map.put(nums[i], i);
			}
		}
		throw new IllegalArgumentException("No match");
	}

	public static void main(String[] args) {

		int nums[] = { 2, 8, 7, 15 };
		int target = 9;

		int arr[] = getArray(nums, target);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}

}
