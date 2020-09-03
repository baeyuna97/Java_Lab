package classpart;

public class Student {
	// 클래스 생성  
	
	// student가 가진 공간 아래 4개 !!
	int studentID;
	String studentName;
	int grade;
	String address;  
	
	// default 생성자  
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	} 
	
	// 함수 생성 
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}

	public String getStudentName() {
		return studentName; 
	}
	
	public void setStudentName(String name) {
		studentName = name;
	} 

}



