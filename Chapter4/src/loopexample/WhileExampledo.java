package loopexample;

public class WhileExampledo {

	public static void main(String[] args) {
		int num =1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		}while(num < 1);
		// 조건이 뒤에 있어 do while문이 한번은 수행된다.
		
		System.out.println("1부터 10까지의 합은 "+ sum + "입니다.");
	}

}
