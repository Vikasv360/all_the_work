package just.learnAndLearn;


class Car{
	
	String Brand;
	String Name;
	static int price;
	
	public void show() {
		System.out.println(Brand + " : " + Name + " : " + price);
	}
	
	public static void show1(Car c3) {
		System.out.println(c3.Brand + " : " + c3.Name + " : " + price);
	}
	
}
public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		c1.Brand="Tata";
		c1.Name="Altroz";
//		Car.price=1200;
		
		Car c2 = new Car();
		c2.Brand="Hyundai";
		c2.Name="i20";
//		Car.price=1300;
		
		Car.price=1400;
		
		c1.show();
		c2.show();
		Car.show1(c1);
		
	}

}
