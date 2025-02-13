package javaProgrammingFromScratch;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateThruArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> tvSeries= new ArrayList<>();
		tvSeries.add("Big bang theory");
		tvSeries.add("Game of thrones");
		tvSeries.add("Young Sheldon");
		tvSeries.add("House of Dragons");
		tvSeries.add("Vikings");
		tvSeries.add("The Last Kingdom");
		
		//1st using enhanced for loop
		System.out.println("*************Using enhanced for loop**************");
		
		for(String series : tvSeries) {
			System.out.println(series);
		}
		
		//2nd Using forEach loop with lamda expression
		System.out.println("*************Using forEach loop with lamda expression**************");
		tvSeries.forEach(shows->{
			System.out.println(shows);
		});
		
		//3rd Using iterator
		System.out.println("*************Using iterator**************");
		Iterator<String> it = tvSeries.iterator();
		
		while(it.hasNext()) {
			
			String tv=it.next();
			System.out.println(tv);
		}
		
		System.out.println("*************Using for loop**************");

		for(int i=0;i<tvSeries.size();i++) {
			
			System.out.println(tvSeries.get(i)); 
		}
		
		
	}

}
