package InterfaceAtOnce;

interface App{
	int age=12;
	String name="Vikas";
	
	void show();
	void config();
	
}

interface VendorApp{
	
	void run();
	
}

class Service implements App,VendorApp{

	@Override
	public void show() {
		
		System.out.println("In show()");
		
	}

	@Override
	public void config() {
		
		System.out.println("In config()");
		
	}

	@Override
	public void run() {
		
		System.out.println("In run()");
		
	}
	
}

public class InterfaceAbstraction {

	public static void main(String[] args) {
		
		Service obj = new Service();
		obj.show();
		obj.config();
		obj.run();
		
		System.out.println(App.age);
		

	}

}
