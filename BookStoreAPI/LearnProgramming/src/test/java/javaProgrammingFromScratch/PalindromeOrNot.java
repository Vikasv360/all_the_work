package javaProgrammingFromScratch;

public class PalindromeOrNot {
	
	public static void isPalindrome(int num) {
		
		int remainder=0;
		int sum=0;
		int t;
		
		t=num;
		
		while(num>0) {
			remainder=num%10;
			sum=(sum*10)+remainder;
			num=num/10;
		}
		
		if(t==sum) {
			System.out.println(t + " is a palindrome");
		}
		else {
			System.out.println(t + " is not a palindrome");
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isPalindrome(151);
		isPalindrome(152);
		isPalindrome(1);
		isPalindrome(7878787);
	}

}
