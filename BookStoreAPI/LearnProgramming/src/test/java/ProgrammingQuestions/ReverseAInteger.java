package ProgrammingQuestions;

public class ReverseAInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int num = 12345;
		int rev=0;
		
		while(num!=0) {
			rev= rev*10 + num %10;
			num=num/10;
		}
		
		System.out.println(rev);
		
		//Second method
		int num1=123456;
		
		StringBuffer str =  new StringBuffer(String.valueOf(num1));
		System.out.println(str.reverse());
		
		
	}

}
