package program;

import java.util.Scanner;

public class FizzBizz {
	
	public static String fizzBizz(int n) {
		
		String result = "";
		
		for(int i=1;i<n;i++) {
			  if (i % 3 == 0 && i % 5 == 0) {
	                result = result + "FizzBizz";
	            }
			  else if(i%3==0) {
				result = result + "Fizz";
			}
			else if(i%5==0) {
				result = result + "Bizz";
			}
			else {
				result=result+String.valueOf(i);
			}
			
			result =result+" ";
		}
		return result.toString().trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        
	        if (sc.hasNextInt()) {
	            int input = sc.nextInt();
	            System.out.println(fizzBizz(input));
	        } else {
	            System.out.println("Please enter a valid integer.");
	        }
	        
	        sc.close();
		
	}

}
