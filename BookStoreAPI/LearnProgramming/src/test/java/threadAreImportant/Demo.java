package threadAreImportant;

class A implements Runnable {

	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("In Class A");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class B  implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("In Class B");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable obj1 = new A();
		Runnable obj2 = new B();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();

	}

}
