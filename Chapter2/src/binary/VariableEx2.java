package binary;

public class VariableEx2 {

	public static void main(String[] args) {

		int num = 10; // 어딘가 num이라는 변수 메모리에 저장
		// 10은 몇 바이트로 저장되어 있는가??
		// -> 정수는 4byte int형으로 저장 
		int level = 50;
		
		// int num = 123456789000;
		// int 정수가 저장할 수 있는 범위를 넘어감 -> 8바이트 long으로 저장
		long nums = 12345678900L; // 8byte 저장 
		// 숫자를 어딘가로 저장하려고 하는데 저장하는 기본이 4바이트 -> 숫자가 너무 크다
		// -> 컴파일러에게 얘는 8바이트로 저장해라고 알려줘야함 (L) 
		
		// float type -> 뒤에 f 
	}

}
