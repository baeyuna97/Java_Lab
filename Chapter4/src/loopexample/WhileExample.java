package loopexample;

public class WhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0; 
		
		// 반복의 조건 
		while( num <= 10) {
			
			sum += num;
			num++; // num += 1
			
			
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
