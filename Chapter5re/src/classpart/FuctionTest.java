package classpart;

// 함수를 만들고 사용 -> 함수를 호출한다. 

public class FuctionTest {
	
	// 1. 프로그램 시작 시, main()함수부터 호출 
	// -> main()함수에 포함된 변수 num1, num2, sum을 저장할 메로리 공간이 생성  
	public static void main(String[]args) {
		int num1 = 10;
		int num2 = 20;
		
		// add함수 호출 
		// 2. main()함수에서 add()함수를 호출하면 
		// -> add()함수를 저장할 메모리 공간이 생성 
		int sum = add(num1, num2);
		// 함수를 호출하면 그 함수만을 위한 메모리 공간이 할당 -> "스택" 
		
		System.out.println(num1 + "+" + num2 + "=" + sum + "입니다 ");
		// 3. add() 함수문이 끝나면 함수에 할당했던 메모리 공간 해제 
		
		// 지역변수는 스택 메모리에 생성 
		
	}
	
	// 함수 생성
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
}
