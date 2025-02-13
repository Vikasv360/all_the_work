package javaProgrammingFromScratch;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Vikas";
		String rev = "";
		
		int Strlen = str.length();
		
		for(int i = Strlen-1;i>=0;i--) {
			
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		StringBuffer str1 = new StringBuffer(str);
		System.out.println(str1.reverse());
		
	}

}
