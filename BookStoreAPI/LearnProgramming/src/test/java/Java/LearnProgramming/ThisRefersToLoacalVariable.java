package Java.LearnProgramming;

class Alien{
	
	private int age;
	private String name;
	
	public Alien(){
		
		age=26;
		name="Vikas";
		System.out.println("In default constructor");
	}
	
public Alien(int age,String name ){
		
		this.age=age;
		this.name=name;
		System.out.println("In parameterized constructor"); 
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age,Alien obj) {
		Alien obj1 = obj;
		obj1.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class ThisRefersToLoacalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alien obj = new Alien();
		Alien obj1 = new Alien(20,"Vivek");
//		obj.setName("Vikas");
//		obj.setAge(30,obj);
		System.out.println(obj.getName()+ " : " + obj.getAge());
		System.out.println(obj1.getName()+ " : " + obj1.getAge());

	}

}
