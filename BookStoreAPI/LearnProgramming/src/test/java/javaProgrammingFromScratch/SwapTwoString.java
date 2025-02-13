package javaProgrammingFromScratch;

public class SwapTwoString {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "Bruh";

		System.out.println("Before swapping the string");
		System.out.println("The value of a is : " + a);
		System.out.println("The value of b is : " + b);

		a = a + b;
		System.out.println(a); // a="HelloBruh"
		b = a.substring(0, a.length() - b.length()); // b="Hello"
		a = a.substring(b.length()); // a="Bruh"

		System.out.println("After swapping the string");
		System.out.println("The value of a is : " + a);
		System.out.println("The value of b is : " + b);

	}

}
