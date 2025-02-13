package Java.LearnProgramming;

abstract class Aero{
	public abstract void drive();
	public abstract void droom();
	
	public void fly() {
		
		System.out.println("Aeroplane can fly....!!!");
	}
}
abstract class Helicop extends Aero{

	public void drive() {
		
		System.out.println("Helicopter abstract method from abstract class....!!!");
	}
	
	
}

class Jets extends Aero{

	public void drive() {
		
		System.out.println("Helicopter abstract method from abstract class....!!!");
	}

	
	public void droom() {
		System.out.println("Jet Vroom's....!!!");
		
	}
	
	
}
public class AbstractKeywordIsFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Jets obj = new Jets();
		obj.drive();
		obj.fly();
		obj.droom();
	}

}
