package binary;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final float PI = 3.14F; 
		// final 상수는 값이 변할 수 없다. 
		// PI = 3.15f;
		
		// 상수 선언 -> 상수 지정한 값만 변경하면 한꺼번에 변경가능 
		final int STUDENT_NUM =30;
		
		int num = 0;
		if ( num == STUDENT_NUM ) {}
		
		System.out.println(STUDENT_NUM);
	}

}
