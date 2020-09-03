package classpart;

public class StudentClass {
	// 클래스 만들고 값들을 넣
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "이순신 ";
		studentLee.address = "서울시 서초구 서초동 ";
		
		studentLee.showStudentInfo();
	}

}
