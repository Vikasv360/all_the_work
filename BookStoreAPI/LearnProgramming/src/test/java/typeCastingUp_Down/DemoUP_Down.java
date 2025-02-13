package typeCastingUp_Down;

class First{
	
	public void show1() {
		System.out.println("In first class");
	}
	
}

class Second extends First{
	public void show2() {
		System.out.println("In second class");
	}
	
}

public class DemoUP_Down {

	public static void main(String[] args) {
		
		// Upcasting
 
		First obj = new Second();
		
		//this above object creation is smae as First obj = (First) new Second();
		obj.show1();
		//obj.show2(); > this method cannot be called 
		
		//DownCasting
		
//		Second obj1 = (Second) new First();
		Second obj1 = (Second) obj;
		obj1.show1();
		obj1.show2();
		
	}

}
