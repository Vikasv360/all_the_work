package Java.LearnProgramming;

class Student{
	
	int rollno;
	String name;
	int marks;
	
}

public class A_ArraysOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		 s1.marks=100;
		 s1.name="Vikas";
		 s1.rollno=3090;
		 
		 Student s2 = new Student();
		 s2.marks=95;
		 s2.name="Vaibhav";
		 s2.rollno=2800;
		 
		 Student s3 = new Student();
		 s3.marks=87;
		 s3.name="Kishan";
		 s3.rollno=3120;
		 
		 Student students[] = new Student[3];
		 students[0]=s1;
		 students[1]=s2;
		 students[2]=s3;
		 
//		 for(int i=0;i<students.length;i++) {
//			 System.out.println(students[i].name);
//		 }
		 
		 for(Student stud : students) {
			 System.out.println(stud.name + " : " + stud.rollno + " : " + stud.marks);
		 }
		 
	}

}
