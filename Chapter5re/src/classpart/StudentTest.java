package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentAhn = new Student(); // Student 클래스 생성
//		studentAhn.studentName = "안승연";
		System.out.println(studentAhn.getStudentName());
		// Student 클래스에서 name변수를 private 처리해
		// 외부 클래스 StudentTest에서 접근 허용 안됨. 
		
		// private 변수 사용하려면 ?
		// set(), get()을 통해 public 매서드 제공 
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
