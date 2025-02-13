package javaProgrammingFromScratch;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWords {

	public static void findDuplicate(String inputString) {
		
		String words[]=inputString.split(" ");//here we are splitting the sentence with white spaces
		//which is stored in an array
		
		//Here we are creating a Map to store key value pairs.
		Map<String,Integer> wordCount= new HashMap<String,Integer>();
		
		//Here we are storing the values into Map interface
		for(String word : words) {
			
			if(wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
			}
			else {
				wordCount.put(word, 1);
			}
		}
		
		//Here we are extracting all the keys from the map "wordCount"
		Set<String> wordInString = wordCount.keySet(); //This will store only the unique key values
		
		
		for(String word: wordInString) {
			if(wordCount.get(word) >1) {
				System.out.println(word + " : " + wordCount.get(word));
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDuplicate("Hey java is java best language is java");
	}

}
