package just.learnAndLearn;


class Encap{
	
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class Encapsule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encap en = new Encap();
		en.setAge(10);
		System.out.println(en.getAge());
		en.setName("Vikas");
		System.out.println(en.getName());
		
	}

}
