package just.learnAndLearn;

class Student {
	String name;
	int age;
	int marks;
}

public class ArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "Vikas";
		s1.age = 26;
		s1.marks = 500;

		Student s2 = new Student();
		s1.name = "vikram";
		s1.age = 24;
		s1.marks = 356;

		Student s3 = new Student();
		s1.name = "Vikranth";
		s1.age = 32;
		s1.marks = 501;

		Student students[] = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
//		for( int n=0;n<student.length;n++) {
//			System.out.println(student[n].name + " : " + student[n].age + " : " + student[n].marks );
//		}
		
		for(Student n: students) {
			System.out.println(n.name  + " : " + n.age + " : " + n.marks);
		}

	}

}
