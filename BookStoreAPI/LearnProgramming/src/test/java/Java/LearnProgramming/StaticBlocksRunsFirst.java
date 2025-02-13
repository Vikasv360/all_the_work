package Java.LearnProgramming;

class Animal{
	static String type;
	 String name;
	
	 static {
		 String type ="Omnivorous";
		 System.out.println("In static block");
	 }
	
	 public Animal() {
		
		 System.out.println("In a constructor");
		 
	 }
	public void show() {
		System.out.println(name + " : " + type);
	}
	
	public static void show1(Animal obj) {
		System.out.println(obj.name + " : " + type);
	}
	
	
}


public class StaticBlocksRunsFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal obj1 = new Animal();
		obj1.name="Lion";
		Animal.type="Carnivorous";
		
		Animal obj2 = new Animal();
		obj2.name="Tiger";
		

		obj1.show();
		obj2.show();
		Animal.show1(obj1);
	}

}
