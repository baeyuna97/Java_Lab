package classpart;

public class StudentTest {

	public static void main(String[] args) {
			
			// 참조변수 생성 
			// 객체는 반드시 new 클래스 ... 생성해서 써야함 
			Student studentLee = new Student();
			studentLee.studentName = "이순신 ";
			studentLee.studentID = 100;
			studentLee.address = "서울시 영등포구 여의도동 ";
			
			Student studentKim = new Student();
			studentKim.studentName = "김유신  ";
			studentKim.studentID = 101;
			studentKim.address = "미국 산호세 ";
			
			studentLee.showStudentInfo();
			studentKim.showStudentInfo();
			
			// 참조값 reference value 
			System.out.println(studentLee);
			System.out.println(studentKim); 
		}
	}

// Stack
// 함수가 호출되면 지역변수가 쌓임 studentLee, studentKim
// 함수가 끝나면 stack이 없어짐

// Heap
// 각 클래스 내 참조변수의 인스턴스 저장 name, id, address. grade 
// 자동으로 없어지지 않고 없애줘야함 -> 다비지 컬랙터? 

// 하나의 클래스 코드로 부터 여러개의 인스턴스 생성
// 인스턴스는 힙 메모리에 생성됨 
// 각각의 인스턴스는 다른 메모리에 다른 값을 가짐 


