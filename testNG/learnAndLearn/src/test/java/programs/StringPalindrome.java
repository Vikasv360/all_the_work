package programs;

public class StringPalindrome {

	public static void main(String args[]) {

		String str = "madam";
		String org_str = str.toLowerCase();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + org_str.charAt(i);
		}

		if (org_str.equals(rev)) {
			System.out.println(org_str + " is a palinndrome");
		} else {
			System.out.println("The given string is not a palindrome.");
		}

	}
}
