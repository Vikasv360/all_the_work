package just.learnAndLearn;

public class CheckPalindrome {
	
	public static boolean isPalindrome(int x) {
		
		if(x<0) {
			return false;
		}
		String num = x +"";
		return checkPalindrome(num);
	}

	private static boolean checkPalindrome(String num) {
		
		int left=0;
		int right =num.length()-1;
		
		if(num.charAt(left)!=num.charAt(right)) {
			return false;
		}
		left++;
		right--;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean res = isPalindrome(1212);
		System.out.println(res);
	}

}
