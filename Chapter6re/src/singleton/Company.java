package singleton;

// 인스턴스를 단 하나만 생성 -> 싱글톤 패턴 
// static을 응용하여 프로그램 전반에서 사용하는 인스턴스를 하나만 구현 
public class Company {

	// 2. 클래스 내부에서 static으로 유일한 인스턴스 생성 
	private static Company instance = new Company(); // 유일하게 생성한 인스턴스 
	
	// 1. 생성자 private 생성
	// -> 외부 클래스에서 마음대로 Company 인스턴스 생성할 수 없다. 
	private Company() {}
	
	// 3. 외부에서 참조할 수 있는 public 매서드 생성 
	// 인스턴스를 외부에서 참조할 수 있도록 public get() 메서드 구현 
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
		// 유일하게 생성한 인스턴스 반환 
	}
		

}
