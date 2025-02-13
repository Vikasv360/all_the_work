package Java.LearnProgramming;

public class ExceptionHandlingTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=20;
		int j=0;
		
		try {
			j = 18/i;
			if(j==0)
				throw new ArithmeticException("We dont need zero as output..!!");
			
		}
		catch(ArithmeticException e) {
			j=18/1;
			System.out.println("This is the default value!!! " + e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Try to retrive the value within the array length....!!!");
		}
		catch(NullPointerException e) {
			System.out.println("Please do not leave the field empty....!!!");
		}
		
		System.out.println(j);

	}

}
