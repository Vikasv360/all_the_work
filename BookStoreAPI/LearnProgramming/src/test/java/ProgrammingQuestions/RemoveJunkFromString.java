package ProgrammingQuestions;

public class RemoveJunkFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		String str = "##@@@^^%%%**** testing String 0128349";
		//Regular expression > [^a-zA-Z0-9]
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
	}

}
