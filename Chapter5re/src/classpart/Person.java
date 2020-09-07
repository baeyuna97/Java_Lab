package classpart;

public class Person {

	String name;
	float height;
	float weight; 
	
	
	// 디폴트 생성자 직접 추가 
	public Person(){}
	
	// 사람이름을 매개변수로 입력받아 Person 클래스를 생성하는 생성자 
	public Person(String pname) {
		name = pname;
	}
	
	// public 클래스명 -> 생성자가 2개 이상 제공
	// -> 생성자 오버로드 
	// 이 클래스를 사용하는 코드에서 원하는 생성자를 선택해 사용 
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight; 
	}
}
