package Java.LearnProgramming;

class Mobile{
	
	static String name;
	String brand;
	int price;
	
	public void show() {
		
		System.out.println(brand + " : " + price + " : " + name );
	}
	
public static void show1(Mobile obj) {
		
		System.out.println(obj.brand + " : " + obj.price + " : " + name );
	}
	
}

public class StaticVariableAcrossAllObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile obj1 = new Mobile();
		obj1.brand="Samsung";
		obj1.price=1200;
		Mobile.name="SmartPhone";
		
		Mobile obj2 = new Mobile();
		obj2.brand="Apple";
		obj2.price=800;
		Mobile.name="SmartPhone";
		
		Mobile.name="Phone"; //Since the name is changed, the changed name will be impacted for all the objects.
		
		obj1.show();
		obj2.show();
		Mobile.show1(obj2); //To access the non static methods in static method, 
		//then we need to create an object reference in static method.
	}

}
