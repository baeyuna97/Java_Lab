package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		// 10개짜리 (1개에 4비트 -> 총 40비트)
//		int[] numbers = new int[10];
		
//		// 배열 초기화 시
//		int[] numbers = new int[] {0,1,2}; // new int[] 괄호 안에 숫자 넣으면 안됨!.
//		
//		System.out.println(numbers.length); // 길이 
		
		
		// 길이 3 배열 만들
		int[] numbers = new int[3];
		
		// 각 위치에 값 대입 
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		// 0부터 배열 길이까지 돌면서 해당위치 값 출력 
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		int[] studentIDs = new int[5];
		
		for(int i = 0; i<studentIDs.length; i++) {
			System.out.println(studentIDs[i]);
		} 
		
	}

}
