package Java.LearnProgramming;

public class SwitchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1;
		
		
		//Using if ELse statements
//		if(n==1)
//		System.out.println("It's Monday");
//		else if(n==2)
//		System.out.println("It's Tuesday");
//		else if(n==3)
//		System.out.println("It's Wednesday");
//		else if(n==4)
//		System.out.println("It's Thrusday");
//		else if(n==5)
//		System.out.println("It's Friday");
//		else if(n==6)
//		System.out.println("It's Saturday");
//		else
//		System.out.println("It's Sunday");
		
		//Using Switch statement
		
		switch(n) {
		
		case 1:
			System.out.println("It's Monday");
			break;
		case 2:
			System.out.println("It's Tuesday");
			break;
		case 3:
			System.out.println("It's Wednesday");
			break;
		case 4:
			System.out.println("It's Thrusday");
			break;
		case 5:
			System.out.println("It's Friday");
			break;
		case 6:
			System.out.println("It's Saturday");
			break;
		default:
			System.out.println("It's Sunday");
		
		
		}
		

	}

}
