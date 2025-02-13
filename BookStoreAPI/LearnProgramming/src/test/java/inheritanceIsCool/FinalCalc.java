package inheritanceIsCool;

public class FinalCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VeryAdvCalc obj = new VeryAdvCalc();
		int r1=obj.add(15, 23);
		int r2=obj.sub(15, 23);
		int r3=obj.mul(15, 23);
		int r4=obj.div(15, 23);
		double r5=obj.scin(15, 23);
		
		System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : " + r5);

	}

}
