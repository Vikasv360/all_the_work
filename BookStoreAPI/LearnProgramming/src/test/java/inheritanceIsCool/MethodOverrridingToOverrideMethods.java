package inheritanceIsCool;

class AB{
	public int add(int n1, int n2) {
		return n1+n2;
	}
	
}

class BB extends AB{
	public int add(int n1, int n2) {
		return n1+n2+1;
	}
}
public class MethodOverrridingToOverrideMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BB obj = new BB();
		int r1=obj.add(5, 6);
		System.out.println(r1);
	}

}
