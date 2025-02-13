package just.learnAndLearn;

class Graduate{
	
	String name="Vikas";
	int rollNo=360;
	
	
	static {
		String dept="Mech";
		System.out.println("In static block...!!!");
	}
	
	public Graduate(){
		System.out.println("In constructor...!!!");
	}
	
	public void show() {
		System.out.println(name + " : " + rollNo);
	}
}


public class StaticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graduate gd = new Graduate();
		Graduate gd1 = new Graduate();
		gd.show();
		
//		System.out.println("In main method");
		
	}

}
