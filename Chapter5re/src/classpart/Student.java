package classpart;

// public class 클래스 이름
// public : 접근 제어
// 클래스 이름 == 자바파일 이름 
public class Student {
	
	// 멤버 변수 ( 클래스 내부에 선언하여 객체 속성 나타냄 )
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	// 매서드
	// 클래스 내부에서 멤버 변수를 사용하여 클래스 기능 구현 
	
	
	// 학생이름 string을 출력하므로 public string (get)
	public String getStudentName() {
		return studentName;
	}
	
	// 학생 이름을 부여하는 메서드  (set) 
	// set메서드는 Student클래스를 사용하는 다른 코드에서 학생의 이름을 새로 지정하거나 바꾸어 준다.
	// 이름을 전달받아 지정하므로 매개변수 name필요
	// 지정만 하고, 반환하지 않으므로 public void 
	public void setStudentName(String name) {
		studentName = name;
	}
	
//	// main 함수설정 1. 클래스 내부에 생성
//	public static void main(String[] args) {
//		Student studentAhn = new Student(); // Student 클래스 생성
//		studentAhn.studentName = "안연수 "; // 생성한 클래스의 studentName 속성 부여
//		
//		System.out.println(studentAhn.studentName);
//		System.out.println(studentAhn.getStudentName());
//		
//	}
}
