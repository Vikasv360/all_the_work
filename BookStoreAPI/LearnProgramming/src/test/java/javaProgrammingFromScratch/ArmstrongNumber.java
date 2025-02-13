package javaProgrammingFromScratch;

public class ArmstrongNumber {
	
	public static void isArmStrongNumber(int num) {
		
		int cube=0;
		int r;
		int t;
		
		t=num; //the given number is assigned to variable "t"
		
		while(num>0) {
			
			r=num%10; //gives remainder
			num=num/10;
			cube= cube+(r*r*r);
			
		}
		
		if(t==cube) {
			System.out.println(t + " is an Armstrong number");
		}
		else {
			System.out.println(t + " is not an Armstrong number");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isArmStrongNumber(371); 
	}

}
