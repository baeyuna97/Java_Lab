package singleleton;

public class Company {

	// 외부에서 이 constructure 호출하지 못하게 하겠다. 
	// -> company는 company class 내부에서 생성해 놓겠다. 
	private static Company instance = new Company();
	// private : 함부로 none 등이 되면 안됨. 
	// static : 1개만 있어야한다. 
	
	private Company() {}
	
	// 가져다 쓸 매소드
	// 객체를 생성하지 않고 (클래스명 객체명 = new 클래스())
	// 클래스를 쓸 수 있는 방법은 static 붙이기 
	public static Company getInstance() {
		if(instance == null)
			instance = new Company(); 
		return instance; 
	}

}
