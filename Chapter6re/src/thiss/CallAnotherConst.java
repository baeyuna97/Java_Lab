package thiss;

class Person{
	String name;
	int age;
	
	Person(){
		this("이름 없음 ", 1);
		// this를 사용해 Person(String, int)생성자 호출 
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//this 사용해서 반환하기
	Person returnItSelf() {
		return this; 
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		// this값을 클래스 변수에 대입 
		Person p = noName.returnItSelf(); 
		// returnItSelf의 반환값 출력 
		System.out.println(p);
		System.out.println(noName);
		// this를 사용하면 자기자신의 주소값 반환 
	}

}
