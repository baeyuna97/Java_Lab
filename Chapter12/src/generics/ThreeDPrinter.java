package generics;

						// 제네릭 클래스 <> : 자료형 매개변수 
public class ThreeDPrinter<T> {

	// 자료형 object
	// -> 모든 클래스의 최상위 클래스 
	// 모튼 클래스는 object로 형변환이 일어난다. 
	
	// 자료형으로 선언한 변수 
	private T material;

	// T 자료형 변수 material을 반환하는 제네릭 메서드 
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	
}
