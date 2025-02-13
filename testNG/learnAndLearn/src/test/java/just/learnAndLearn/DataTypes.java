package just.learnAndLearn;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short sh = 34;
		int in = 1235;
		long lg = 12345;
		byte by =127;
		float fl = 4.5f;
		double db = 4.345;
		char ch = 65;
		
		System.out.println(ch);
		
		int n=4;
		int result=0;
		
		//Syntax : 
		//condition ? true value : false value;
		result = n%2==0 ? 10 :20;
		System.out.println(result);
		
		
		String key ="tuesday";
		
		switch (key) {
		case "monday":
			System.out.println("Im monday");
			break;
			
		case "tuesday":
			System.out.println("Im tuesday");
			break;

		default:
			System.out.println("Invalid day...!!!!");
			break;
		}
		
	}

}
