package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapKeyValuePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Map<String, Integer> students =  new Hashtable();
		students.put("Vikas", 46);
		students.put("Vivek", 56);
		students.put("Anjan", 23);
		students.put("Amit", 67);
		students.put("Pavan", 89);
		System.out.println(students);
		
		System.out.println(students.get("Anjan"));
		
		System.out.println(students.keySet());
		
		for(String key : students.keySet()) {
			System.out.println(key + " : " + students.get(key) );
		}
		
		
		
	}

}
