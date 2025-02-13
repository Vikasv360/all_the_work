package typeCastingUp_Down;

public class WrapperClassesPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =7;
		//Here we are converting the primitive dataType into objects using Wrapper class
		Integer num1 = num;
		System.out.println(num1);   //AutoBoxing
		
		//Here we are converting the objects into primitive dataType.
		int num2=num1; 
		
		System.out.println(num2);
		
		String str = "12";
		int num3= Integer.parseInt(str);
		System.out.println(str);

	}

}
