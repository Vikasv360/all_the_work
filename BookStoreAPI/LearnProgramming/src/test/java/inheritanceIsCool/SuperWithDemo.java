package inheritanceIsCool;

class A{
	
	public A() {
		System.out.println("In default constructor of A");
	}
	
	public A(int a) {
		
		System.out.println("In parameterized constructor of A");
	}
}

class B extends A{
	
	public B() {
		
		System.out.println("In default constructor of B");
	}
	
	public B(int a) {
//		super(5);
		this();
		System.out.println("In parameterized constructor of B");
	}
	
}
public class SuperWithDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj = new B(2);
		
	}

}
