package Java.LearnProgramming;

public class A_TypeConversion_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		byte b =127;
		int a =2345;
		byte k =(byte) a;
		System.out.println(a);
		
		float f = 5.6f;
		int t =(int) f;
		System.out.println(t);
		
		//Type promotion
		
		byte c = 10;
		byte d = 15;
		 int result = c * d;
		 System.out.println(result);
		 
		 int x = 4;
		 int y=4;
		 
		 int result1 = x%y;
		 System.out.println(result1);
	}

}
