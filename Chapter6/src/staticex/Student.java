package staticex;

public class Student {
	
	private static int serialNum = 10000;
	// private 선정 -> 외부에서 함부로 값을 변경하면 안됨. 
	
	int studentID;
	String studentName;
	
	// 학생이 증가하면 constructal가 호출된다.
	public Student() { 
		// serialNum은 공유되면서 계속 증가가 될 것이다. 
		serialNum++;
		// private -> class의 생성자가 호출될 때만 증가해야됨. 
		
		// studentID는 serialNum에서 복사되서 각각 인스턴스마다 가지고 있다. 
		studentID = serialNum; 
	}

	public static int getSerialNum() {
		// static 매소드에서는 instance변수를 쓸 수 없다.
		int i = 10; // i 매소드 안에서만 쓰고 끝나므로 지역 변수 
		
		i++;
		System.out.println(i);
		
		studentName = "홍길동 "; // 멤버변수, 인스턴스 변수 
		
		return serialNum; // static 변수, 클래스 변수 
	}
	
//	값은 변경시키면 안되고 가져가기만 해야하므로
//  get만 만들고 set은 없애 
	
//	public static void setSerialNum(int serialNum) {
//		Student.serialNum = serialNum;
//	}
//	
	
	
}
