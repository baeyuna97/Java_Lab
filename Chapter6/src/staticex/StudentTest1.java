package staticex;

public class StudentTest1 {

	public static void main(String[] args) { 
//		System.out.println(Student.serialNum);
		
		System.out.println(Student.getSerialNum());
		
		Student studentJ = new Student();
		System.out.println(studentJ.getSerialNum());
		
//		System.out.println(studentJ.studentID);
//		
//		
		Student studentT = new Student();
		System.out.println(studentT.studentID);
//		// 두 인스턴스 값이 공유되고 있다. 
//		System.out.println(studentT.studentID);
//		
//		System.out.println(Student.serialNum);
//		System.out.println(Student.serialNum);
		 
	} 

}
