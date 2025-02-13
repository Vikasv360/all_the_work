package javaProgrammingFromScratch;

class Human{
	
	public static void body(int bones) {
		
		System.out.println("In Human class, body method");
	}
	
	public void head() {
		System.out.println("In Human class, head method");
	}
	
}
class Alien extends Human{
	
  public static void body(int bones,int age) {
		
		System.out.println("In Alien class, body method");	}
}

public class OverLoadStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human.body(5);
		Alien.body(5,15);

	}

}
