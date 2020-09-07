package classpart;

public class PersonTest {
	public static void main(String[] args) {
		// 디폴트 생성자로 클래스 생성 후 
		Person personLee = new Person();
		// 인스턴스 변수 값 초기화
		personLee.name = "이순신 ";
		personLee.weight = 85.5F;
		personLee.height = 180.0F; 
		
		Person personbae = new Person("배유나 ", 162, 56); 
	}
}
