package binary;

public class DoubleEx {
	
	int abc; // global 변수는 자료형 추론불가  

	public static void main(String[] args) {
		
		// 지역변수는 자료형 추론가능 
		// double dNum = 3.14; //8 바이트  
		float fNum = 3.14F; //4 바이트  
			// float 쓸 때 오류가 나면 뒤에 F식별자 붙여서 float으로 저장 
		
		var dNum = 3.14;
		System.out.println(dNum);
		
		int num = 10;
		System.out.println(num);  
		
	}

}
