package just.learnAndLearn;

public class ReverseAStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="vikas";
		String rev = "";
		
		for(int i =str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println("The reversed string is : " + rev);
		
	}

}
