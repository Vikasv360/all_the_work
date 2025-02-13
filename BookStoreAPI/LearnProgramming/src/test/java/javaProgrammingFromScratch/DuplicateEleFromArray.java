package javaProgrammingFromScratch;

import java.util.HashSet;
import java.util.Set;

public class DuplicateEleFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[] = { "Java", "JavaScript", "Ruby", "Kotlin", "Java", "Ruby" };

		// 1. Compare each element with for loop: --worst solution(Time complexity =
		// O(n*n)

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {

				if (names[i].equals(names[j])) {

					System.out.println("The duplicate value in the array is : " + names[i]);
				}
			}
		}

		// 2. Using HashSet : Java collection which stores unique values

		Set<String> store = new HashSet<String>();

		for (String name : names) {

			if (store.add(name) == false) {
				System.out.println("The duplicate value in the array is : " + name);
			}

		}

	}

}
